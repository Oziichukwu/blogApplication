package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository{
    List<Author>authors = new ArrayList<>();
    @Override
    public Author save(Author author) {
        authors.add(author);
        return findByAuthorId(author.getAuthorId());
    }

    @Override
    public Author findByAuthorId(String id) {
        for (Author author : authors){
            if(author.getAuthorId().equalsIgnoreCase(id)){
                return author;
            }
        }
        return null;
    }

    @Override
    public void delete(Author author) {
        authors.remove(author);
    }

    @Override
    public void delete(String id) {
        Author author = findByAuthorId(id);
        authors.remove(author);
    }

    @Override
    public List<Author> findAll() {
        return authors;
    }
}
