package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;

import java.util.List;

public interface AuthorRepository {

    Author save (Author author);
    Author findByAuthorId(String id);
    void delete(Author author);
    void delete(String id);
    List<Author>findAll();
}
