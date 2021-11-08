package africa.semicolon.blogApplication.controllers;

import africa.semicolon.blogApplication.data.dtos.request.PostRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.PostResponseDto;
import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.services.PostService;
import africa.semicolon.blogApplication.services.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    private final PostService postService = new PostServiceImpl();

    @PostMapping("/api/createpost")
    public PostResponseDto createPost (@RequestBody PostRequestDto postRequestDto){

        return postService.createPost(postRequestDto);
    }
    @GetMapping("/api/post{id}")
    public Post findPostById(@PathVariable("id") String id){
        return postService.findPostById(id);
    }

    @DeleteMapping("/post/{postId}")
    public Post deletePostById(@PathVariable String postId){
        return postService.findPostById(postId);
    }

    @PatchMapping("/post/{postId}")
    public Post updatePost(@RequestBody PostRequestDto updatedPost, @PathVariable String postId){
        return postService.updatePost(postId, updatedPost);
    }
}
