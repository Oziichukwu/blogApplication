package africa.semicolon.blogApplication.utils;

import africa.semicolon.blogApplication.data.dtos.request.CommentRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.CommentResponseDto;
import africa.semicolon.blogApplication.data.models.Comment;

public class CommentModelMapper {

    public static Comment map(CommentRequestDto commentRequestDto){

        Comment comment = new Comment();
        comment.setCommentId(commentRequestDto.getCommentId());
        comment.setCommentorName(commentRequestDto.getCommentorName());
        comment.setContent(commentRequestDto.getContent());
        comment.setDateCommentWasCreated(commentRequestDto.getDateCommentWasMade());

        return comment;
    }

    public static CommentResponseDto map(Comment savedComment){

        CommentResponseDto commentResponseDto = new CommentResponseDto();

        commentResponseDto.setCommentId(savedComment.getCommentId());
        commentResponseDto.setCommentorName(savedComment.getCommentorName());
        commentResponseDto.setContent(savedComment.getContent());
        commentResponseDto.setDateCommentWasMade(savedComment.getDateCommentWasCreated());

        return commentResponseDto;
    }
}
