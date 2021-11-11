package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Post;

import java.util.*;

public class PostRepositoryImpl implements PostRepository {
    private final Map<String, Post> database = new HashMap<>();
    @Override
    public Post save(Post post) {
        database.put(post.getPostId(), post);
        return post;
    }

    @Override
    public Optional<Post> findPostByPostId(String postId) {
        if (database.containsKey(postId)) return Optional.of(database.get(postId));
        return Optional.empty();
    }

    @Override
    public void delete(Post post) {
        delete(post.getPostId());
    }

    @Override
    public void delete(String postId) {
        database.remove(postId);
    }

    @Override
    public void deleteAll() {
        database.clear();
    }

    @Override
    public List<Post> findAll() {
        List<Post> posts = new ArrayList<>();
        Set<String> keysInDb = database.keySet();
        for (String key : keysInDb){
            posts.add(database.get(key));
        }
        return posts;
    }
}
