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
    public Comment findCommentById(String id) {
        return commentRepository.findByUniqueId(id);
    }

    @Override
    public void deleteComment(Comment comment) {
        commentRepository.delete(comment);
    }

    @Override
    public void deleteCommentById(String id) {
        Comment deletedComment = commentRepository.findByUniqueId(id);
        commentRepository.delete(deletedComment);
    }
}
