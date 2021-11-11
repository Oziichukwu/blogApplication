package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    Post save(Post post);
    Optional<Post> findPostByPostId(String postId);
    void delete (Post post);
    void delete(String postId);
    void deleteAll();
    List<Post>findAll();

}
