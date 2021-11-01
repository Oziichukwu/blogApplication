package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;
import africa.semicolon.blogApplication.data.models.Comment;
import africa.semicolon.blogApplication.data.models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {

    CommentRepository commentRepository;
    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
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


        Comment comment = new Comment();
        comment.setCommentUniqueId("#1123");
        comment.setCommentorName("Precious Chidiebere");
        comment.setContent("Its high time africa begin to harness this great potential");
        LocalDate localDate = LocalDate.now();
        comment.setDateCreated(localDate);

        Comment savedComment = commentRepository.save(comment);
        assertEquals(comment, savedComment);

    }

    @Test
    void findByUniqueId() {

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


        Comment comment = new Comment();
        comment.setCommentUniqueId("#1123");
        comment.setCommentorName("Precious Chidiebere");
        comment.setContent("Its high time africa begin to harness this great potential");
        LocalDate localDate = LocalDate.now();
        comment.setDateCreated(localDate);

        Comment savedComment = commentRepository.save(comment);
        Comment foundComment = commentRepository.findByUniqueId("#1123");
        assertEquals(savedComment,foundComment);

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


        Comment comment = new Comment();
        comment.setCommentUniqueId("#1123");
        comment.setCommentorName("Precious Chidiebere");
        comment.setContent("Its high time africa begin to harness this great potential");
        LocalDate localDate = LocalDate.now();
        comment.setDateCreated(localDate);

        commentRepository.save(comment);
        assertNotNull(commentRepository.findByUniqueId("#1123"));

        commentRepository.delete(comment);
        assertNull(commentRepository.findByUniqueId("#1123"));
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


        Comment comment = new Comment();
        comment.setCommentUniqueId("#1123");
        comment.setCommentorName("Precious Chidiebere");
        comment.setContent("Its high time africa begin to harness this great potential");
        LocalDate localDate = LocalDate.now();
        comment.setDateCreated(localDate);

        commentRepository.save(comment);
        assertNotNull(commentRepository.findByUniqueId("#1123"));

        commentRepository.delete("#1123");
        assertNull(commentRepository.findByUniqueId("#1123"));
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


        Comment comment = new Comment();
        comment.setCommentUniqueId("#1123");
        comment.setCommentorName("Precious Chidiebere");
        comment.setContent("Its high time africa begin to harness this great potential");
        LocalDate localDate = LocalDate.now();
        comment.setDateCreated(localDate);

        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        assertEquals(4, commentRepository.findAll().size());
    }
}