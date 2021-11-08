package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.CommentRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.CommentResponseDto;
import africa.semicolon.blogApplication.data.models.Comment;

public interface CommentService {

    CommentResponseDto addComment(CommentRequestDto commentRequestDto);
    Comment updateComment(String commentId, CommentRequestDto commentRequestDto);
    Comment findCommentById(String id);
    Comment deleteComment(Comment comment);
    Comment deleteCommentById(String id);

}
