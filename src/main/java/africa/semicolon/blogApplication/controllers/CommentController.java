package africa.semicolon.blogApplication.controllers;

import africa.semicolon.blogApplication.data.dtos.request.CommentRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.CommentResponseDto;
import africa.semicolon.blogApplication.data.models.Comment;
import africa.semicolon.blogApplication.services.CommentService;
import africa.semicolon.blogApplication.services.CommentServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    private final CommentService commentService = new CommentServiceImpl();

    @PostMapping("/api/addcomment")
    public CommentResponseDto addComment(@RequestBody CommentRequestDto commentRequestDto){

        return commentService.addComment(commentRequestDto);

    }
    @GetMapping("/api/comment{id}")
    public Comment findCommentById(@PathVariable ("id") String id){

        return commentService.findCommentById(id);
    }
}
