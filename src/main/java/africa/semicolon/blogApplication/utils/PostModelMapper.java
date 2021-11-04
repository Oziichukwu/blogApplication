package africa.semicolon.blogApplication.utils;

import africa.semicolon.blogApplication.data.dtos.request.PostRequestDto;
import africa.semicolon.blogApplication.data.models.Post;

public class PostModelMapper {

    public static Post map (PostRequestDto postRequestDto){
        Post post = new Post();

        post.setAuthor(postRequestDto.getAuthor());
        post.setPostId(postRequestDto.getAuthorId());
        post.setTitle(postRequestDto.getTitle());
        post.setContent(postRequestDto.getContent());
        post.setTimePublished(postRequestDto.getDatePostWasCreated());

        return post;
    }
}
