package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.CommentRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.CommentResponseDto;
import africa.semicolon.blogApplication.data.models.Comment;
import africa.semicolon.blogApplication.data.repositories.CommentRepository;
import africa.semicolon.blogApplication.data.repositories.CommentRepositoryImpl;
import africa.semicolon.blogApplication.utils.CommentModelMapper;

public class CommentServiceImpl implements CommentService{
    CommentRepository commentRepository = new CommentRepositoryImpl();

    @Override
    public CommentResponseDto addComment(CommentRequestDto commentRequestDto) {

        Comment comment = CommentModelMapper.map(commentRequestDto);

        Comment savedComment = commentRepository.save(comment);

        CommentResponseDto commentResponseDto = CommentModelMapper.map(savedComment);

        return commentResponseDto;
    }

    @Override
    public Comment updateComment(String commentId, CommentRequestDto commentRequestDto) {
        Comment commentToBeUpdated = findCommentById(commentId);

        if (!commentToBeUpdated.getCommentorName().equals(commentRequestDto.getCommentorName())){
            commentToBeUpdated.setCommentorName(commentRequestDto.getCommentorName());
        }
        if (!commentToBeUpdated.getContent().equals(commentRequestDto.getContent())){
            commentToBeUpdated.setContent(commentRequestDto.getContent());
        }
        return commentRepository.save(commentToBeUpdated);
    }

    @Override
    public Comment findCommentById(String id) {
        return commentRepository.findByUniqueId(id);
    }

    @Override
    public Comment deleteComment(Comment comment) {
        commentRepository.delete(comment);
        return comment;
    }

    @Override
    public Comment deleteCommentById(String id) {
        Comment deletedComment = commentRepository.findByUniqueId(id);
        commentRepository.delete(deletedComment);
        return deletedComment;
    }
}
