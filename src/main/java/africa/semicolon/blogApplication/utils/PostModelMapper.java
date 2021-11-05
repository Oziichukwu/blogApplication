package africa.semicolon.blogApplication.utils;

import africa.semicolon.blogApplication.data.dtos.request.PostRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.PostResponseDto;
import africa.semicolon.blogApplication.data.models.Post;

public class PostModelMapper {

    public static Post map (PostRequestDto postRequestDto){
        Post post = new Post();

        post.setAuthor(postRequestDto.getAuthor());

        post.setPostId(postRequestDto.getPostId());
        post.setTitle(postRequestDto.getTitle());
        post.setContent(postRequestDto.getContent());
        post.setLocalDateTime(postRequestDto.getDatePostWasCreated());

        return post;
    }

    public static PostResponseDto map(Post savedPost){

        PostResponseDto responseDto = new PostResponseDto();
        responseDto.setAuthorId(savedPost.getPostId());
        responseDto.setPostId(savedPost.getPostId());
        responseDto.setDatePostWasCreated(savedPost.getLocalDateTime());
        responseDto.setTitle(savedPost.getTitle());
        responseDto.setContent(savedPost.getContent());
        return responseDto;
    }
}
