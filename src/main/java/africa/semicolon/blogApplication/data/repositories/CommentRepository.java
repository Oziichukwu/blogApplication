package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {

    Comment save(Comment comment);
    Optional<Comment> findByUniqueId(String commentId);
    void delete (Comment comment);
    void delete (String commentId);
    void deleteAll();
    List<Comment>findAll();
}
