package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{
    List<Comment> comments = new ArrayList<>();

    @Override
    public Comment save(Comment comment) {
        comments.add(comment);
        return findByUniqueId(comment.getCommentUniqueId());
    }

    @Override
    public Comment findByUniqueId(String id) {

        for ( Comment comment : comments){

            if (comment.getCommentUniqueId().equalsIgnoreCase(id)){
                return comment;
            }
        }
        return null;
    }

    @Override
    public void delete(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public void delete(String id) {
        Comment comment = findByUniqueId(id);
        comments.remove(comment);
    }

    @Override
    public List<Comment> findAll() {
        return comments;
    }
}
