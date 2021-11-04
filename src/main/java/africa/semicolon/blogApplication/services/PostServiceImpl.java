package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.PostRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.PostResponseDto;
import africa.semicolon.blogApplication.data.exceptions.PostDoesNotExistException;
import africa.semicolon.blogApplication.data.models.Author;
import africa.semicolon.blogApplication.data.models.Comment;
import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.data.repositories.PostRepository;
import africa.semicolon.blogApplication.data.repositories.PostRepositoryImpl;
import africa.semicolon.blogApplication.utils.PostModelMapper;

import java.time.LocalDateTime;
import java.util.List;

public class PostServiceImpl implements  PostService{

    private final PostRepository postRepository = new PostRepositoryImpl();

    @Override
    public PostResponseDto createPost(PostRequestDto postRequestDto) {

        Post post = PostModelMapper.map(postRequestDto);

        Post savedPost = postRepository.save(post);

        PostResponseDto responseDto = PostModelMapper.map(savedPost);

        return responseDto;
    }

    @Override
    public List<Post> findAByPost(PostRequestDto postRequestDto) {
        return null;
    }

    @Override
    public PostResponseDto updatePost(PostRequestDto postRequestDto) {
        return null;
    }

    @Override
    public Post findPostById(String id){
        return postRepository.findByPostId(id);
    }

    @Override
    public void deletePostById(long id) {

    }

}
