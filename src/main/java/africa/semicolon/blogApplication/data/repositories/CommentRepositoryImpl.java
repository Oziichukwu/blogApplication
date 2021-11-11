package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Comment;
import africa.semicolon.blogApplication.data.models.Post;

import java.util.*;

public class CommentRepositoryImpl implements CommentRepository{

    private final Map<String , Comment> database = new HashMap<>();
    @Override
    public Comment save(Comment comment) {
        database.put(comment.getCommentId(), comment);
        return comment;
    }

    @Override
    public Optional<Comment> findByUniqueId(String commentId) {
        if (database.containsKey(commentId)) return Optional.of(database.get(commentId));
        return Optional.empty();
    }

    @Override
    public void delete(Comment comment) {
        delete(comment.getCommentId());
    }

    @Override
    public void delete(String commentId) {
        database.remove(commentId);
    }

    @Override
    public void deleteAll() {
        database.clear();
    }

    @Override
    public List<Comment> findAll() {
        List<Comment> comments = new ArrayList<>();
        Set<String>keysInDb = database.keySet();
        for(String key : keysInDb){
            comments.add(database.get(key));
        }
        return comments;
    }
}
