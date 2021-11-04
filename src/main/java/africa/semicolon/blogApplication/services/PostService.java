package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.PostRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.PostResponseDto;
import africa.semicolon.blogApplication.data.exceptions.PostDoesNotExistException;
import africa.semicolon.blogApplication.data.models.Post;

import java.util.List;

public interface PostService {

   PostResponseDto createPost(PostRequestDto postRequestDto);
   List<Post>findAByPost(PostRequestDto postRequestDto);
   PostResponseDto updatePost(PostRequestDto postRequestDto);
   Post findPostById(Long id) throws PostDoesNotExistException;
   void deletePostById(long id);

}
