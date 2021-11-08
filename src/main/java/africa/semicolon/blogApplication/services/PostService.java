package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.PostRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.PostResponseDto;
import africa.semicolon.blogApplication.data.models.Post;

public interface PostService {

   PostResponseDto createPost(PostRequestDto postRequestDto);
   Post updatePost(String id, PostRequestDto postRequestDto);
   Post findPostById(String id);
   void deletePostById(String id);

}
