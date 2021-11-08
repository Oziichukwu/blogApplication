package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.PostRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.PostResponseDto;
import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.data.repositories.PostRepository;
import africa.semicolon.blogApplication.data.repositories.PostRepositoryImpl;
import africa.semicolon.blogApplication.utils.PostModelMapper;

public class PostServiceImpl implements  PostService{

    private final PostRepository postRepository = new PostRepositoryImpl();
    private  static AuthorService authorService = new AuthorServiceImpl();
    @Override
    public PostResponseDto createPost(PostRequestDto postRequestDto) {
        Post post = PostModelMapper.map(postRequestDto);

        Post savedPost = postRepository.save(post);

        PostResponseDto responseDto = PostModelMapper.map(savedPost);
        return responseDto;
    }


    @Override
    public Post updatePost(String id, PostRequestDto postRequestDto) {

        Post postToUpdate = findPostById(id);
        if (!postToUpdate.getTitle().equals(postRequestDto.getTitle())){
            postToUpdate.setTitle(postRequestDto.getTitle());
        }
        if (!postToUpdate.getContent().equals(postRequestDto.getContent())){
            postToUpdate.setContent(postRequestDto.getContent());
        }
        return postRepository.save(postToUpdate);
    }

    @Override
    public Post findPostById(String id){
        return postRepository.findByPostId(id);
    }

    @Override
    public void deletePostById(String id) {
        Post findAPostId = postRepository.findByPostId(id);
        postRepository.delete(findAPostId);
    }

}
