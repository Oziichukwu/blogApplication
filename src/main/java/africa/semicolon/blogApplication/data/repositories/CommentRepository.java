package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Comment;

import java.util.List;

public interface CommentRepository {

    Comment save(Comment comment);
    Comment findByUniqueId(String id);
    void delete (Comment comment);
    void delete (String id);
    List<Comment>findAll();
}
