package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;

import java.util.*;

public class AuthorRepositoryImpl implements AuthorRepository{

    private final Map <String, Author> database = new HashMap();
    @Override
    public Author save(Author author) {
        database.put(author.getAuthorId(), author);
        return author;
    }

    @Override
    public Optional<Author> findByAuthorId(String authorId) {
       if (database.containsKey(authorId)) return Optional.of(database.get(authorId));
        return Optional.empty();
    }

    @Override
    public void delete(Author author) {
        delete(author.getAuthorId());
    }

    @Override
    public void delete(String authorId) {
        database.remove(authorId);
    }

    @Override
    public void deleteAll() {
        database.clear();
    }

    @Override
    public List<Author> findAll() {
        List<Author>authors = new ArrayList<>();
        Set<String>keysInDb = database.keySet();
        for(String key : keysInDb){
            authors.add(database.get(key));
        }
        return authors;
    }
}
