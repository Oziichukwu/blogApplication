package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;
import africa.semicolon.blogApplication.data.models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {

    PostRepository postRepository;

    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryImpl();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void save() {
        Author author = new Author();
        Post post = new Post();
        post.setAuthorId(author.getAuthorId());
        post.setPostId("32101");
        post.setTitle("Importance of Tech Innovations in Africa");
        post.setContent("The importance of tech innovation in africa cannot be overemphasized" +
                "as the economic growth of the continent depends largely on innovations in the area of tech");

        Post savedPost = postRepository.save(post);
        assertEquals(1, postRepository.findAll().size());
        assertEquals(savedPost,savedPost);
    }

    public Post postTest(){
        Author author = new Author();
        Post post = new Post();
        post.setAuthorId(author.getAuthorId());
        post.setPostId("32101");
        post.setTitle("Importance of Tech Innovations in Africa");
        post.setContent("The importance of tech innovation in africa cannot be overemphasized" +
                "as the economic growth of the continent depends largely on innovations in the area of tech");

        return postRepository.save(post);
    }

    @Test
    void findPostByPostId() {
        Post savedPost = postTest();
        assertEquals(savedPost, postRepository.findPostByPostId(savedPost.getPostId()).get());
    }

    @Test
    void delete() {
        Post savedPost = postTest();
        assertEquals(1, postRepository.findAll().size());
        postRepository.delete(savedPost);
        assertEquals(0, postRepository.findAll().size());
    }

    @Test
    void testDelete() {
        Post savedPost = postTest();
        assertEquals(1, postRepository.findAll().size());
        postRepository.delete(savedPost.getPostId());
        assertEquals(0, postRepository.findAll().size());
    }

    @Test
    void deleteAll() {
        postTest();
        assertEquals(1, postRepository.findAll().size());
        postRepository.deleteAll();
        assertEquals(0, postRepository.findAll().size());
    }

}