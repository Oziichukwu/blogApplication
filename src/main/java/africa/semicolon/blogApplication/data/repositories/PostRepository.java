package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Post;

import java.util.List;

public interface PostRepository {

    Post save(Post post);
    Post findByPostId(String id);
    void delete (Post post);
    void delete(String id);
    List<Post>findAll();

}
