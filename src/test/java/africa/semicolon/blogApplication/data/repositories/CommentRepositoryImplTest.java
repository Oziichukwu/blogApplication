package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Comment;
import africa.semicolon.blogApplication.data.models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

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
        Comment comment = new Comment();
        Post post = new Post();
        comment.setCommentId("321011");
        comment.setPostId(post.getPostId());
        comment.setCommentorName("Precious Chidiebere");
        comment.setContent("Its high time africa begin to harness this great potential");
        Comment savedComment = commentRepository.save(comment);
        assertEquals(comment, savedComment);
        assertEquals(1, commentRepository.findAll().size());

    }
    public Comment savedCommetTest(){
        Comment comment = new Comment();
        Post post = new Post();
        comment.setCommentId("321011");
        comment.setPostId(post.getPostId());
        comment.setCommentorName("Precious Chidiebere");
        comment.setContent("Its high time africa begin to harness this great potential");
        return commentRepository.save(comment);

    }

    @Test
    void findByUniqueId() {
        Comment savedComment = savedCommetTest();
        assertEquals(savedComment, commentRepository.findByUniqueId(savedComment.getCommentId()).get());
    }

    @Test
    void delete() {
        Comment savedComment = savedCommetTest();
        assertEquals(1, commentRepository.findAll().size());
        commentRepository.delete(savedComment);
        assertEquals(0, commentRepository.findAll().size());
    }

    @Test
    void testDelete() {
        Comment savedComment = savedCommetTest();
        assertEquals(1, commentRepository.findAll().size());
        commentRepository.delete(savedComment);
        assertEquals(0, commentRepository.findAll().size());
    }

    @Test
    void deleteAll() {
        savedCommetTest();
        assertEquals(1, commentRepository.findAll().size());
        commentRepository.deleteAll();
        assertEquals(0, commentRepository.findAll().size());
    }
}