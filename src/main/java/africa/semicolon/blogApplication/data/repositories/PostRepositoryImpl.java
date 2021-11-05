package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository{

    List<Post>posts = new ArrayList<>();

    @Override
    public Post save(Post post) {
        posts.add(post);
        return findByPostId(post.getPostId());
    }

    @Override
    public Post findByPostId(String id) {
        for (Post post : posts){
            if(post.getPostId().equalsIgnoreCase(id)){
                return post;
            }
        }
        return null;
    }

    @Override
    public void delete(Post post) {

        posts.remove(post);
    }

    @Override
    public void delete(String id) {

        Post post = findByPostId(id);
        posts.remove(post);
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }
}
