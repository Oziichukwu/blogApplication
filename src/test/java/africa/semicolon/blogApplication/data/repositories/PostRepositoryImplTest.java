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
        author.setFirstName("Goodnews");
        author.setLastName("Moses");
        author.setEmail("ukaegbu.gboy@gmail.com");
        author.setUserName("goodnews123");
        author.setAuthorId("3210");

        Post post = new Post();
        post.setPostId("324145456");
        post.setAuthor(author);
        post.setTitle("Importance of Tech Innovations in Africa");
        post.setContent("The importance of tech innovation in africa cannot be overemphasized" +
                "as the economic growth of the continent depends largely on innovations in the area of tech");

        Post savedPost = postRepository.save(post);
        assertEquals(post, savedPost);
    }

    @Test
    void findByPostId() {
        Author author = new Author();
        author.setFirstName("Goodnews");
        author.setLastName("Moses");
        author.setEmail("ukaegbu.gboy@gmail.com");
        author.setUserName("goodnews123");
        author.setAuthorId("3210");

        Post post = new Post();
        post.setPostId("324145456");
        post.setAuthor(author);
        post.setTitle("Importance of Tech Innovations in Africa");
        post.setContent("The importance of tech innovation in africa cannot be overemphasized" +
                "as the economic growth of the continent depends largely on innovations in the area of tech");

        Post savedPost = postRepository.save(post);
        Post foundPost = postRepository.findByPostId("324145456");
        assertEquals(savedPost,foundPost);

    }

    @Test
    void delete() {
        Author author = new Author();
        author.setFirstName("Goodnews");
        author.setLastName("Moses");
        author.setEmail("ukaegbu.gboy@gmail.com");
        author.setUserName("goodnews123");
        author.setAuthorId("3210");

        Post post = new Post();
        post.setPostId("324145456");
        post.setAuthor(author);
        post.setTitle("Importance of Tech Innovations in Africa");
        post.setContent("The importance of tech innovation in africa cannot be overemphasized" +
                "as the economic growth of the continent depends largely on innovations in the area of tech");

        postRepository.save(post);
        assertNotNull(postRepository.findByPostId("324145456"));

        postRepository.delete(post);
        assertNull(postRepository.findByPostId("324145456"));
    }

    @Test
    void testDelete() {
        Author author = new Author();
        author.setFirstName("Goodnews");
        author.setLastName("Moses");
        author.setEmail("ukaegbu.gboy@gmail.com");
        author.setUserName("goodnews123");
        author.setAuthorId("3210");

        Post post = new Post();
        post.setPostId("324145456");
        post.setAuthor(author);
        post.setTitle("Importance of Tech Innovations in Africa");
        post.setContent("The importance of tech innovation in africa cannot be overemphasized" +
                "as the economic growth of the continent depends largely on innovations in the area of tech");

        postRepository.save(post);
        assertNotNull(postRepository.findByPostId("324145456"));

        postRepository.delete("324145456");

        assertNull(postRepository.findByPostId("324145456"));

    }

    @Test
    void findAll() {
        Author author = new Author();
        author.setFirstName("Goodnews");
        author.setLastName("Moses");
        author.setEmail("ukaegbu.gboy@gmail.com");
        author.setUserName("goodnews123");
        author.setAuthorId("3210");

        Post post = new Post();
        post.setPostId("324145456");
        post.setAuthor(author);
        post.setTitle("Importance of Tech Innovations in Africa");
        post.setContent("The importance of tech innovation in africa cannot be overemphasized" +
                "as the economic growth of the continent depends largely on innovations in the area of tech");

        postRepository.save(post);
        postRepository.save(post);
        postRepository.save(post);

        assertEquals(3, postRepository.findAll().size());

        postRepository.delete(post);
        assertEquals(2, postRepository.findAll().size());
    }
}