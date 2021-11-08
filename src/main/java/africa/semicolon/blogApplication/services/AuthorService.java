package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.AuthorRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.AuthorResponseDto;
import africa.semicolon.blogApplication.data.models.Author;

import java.util.List;

public interface AuthorService {

    AuthorResponseDto createAuthor(AuthorRequestDto authorRequestDto);
    Author updateAuthor(String id, AuthorRequestDto authorRequestDto);
    List<Author>findById();
    void deleteAuthorById(String id);
    void deleteAuthor(Author author);
    Author findAuthorById(String id);
}
