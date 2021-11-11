package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {

    Author save (Author author);
    Optional<Author> findByAuthorId(String authorId);
    void delete(Author author);
    void delete(String authorId);
    void deleteAll();
    List<Author>findAll();
}
