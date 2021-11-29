package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.CreateAuthorRequest;
import africa.semicolon.blogApplication.data.dtos.response.CreateAuthorResponse;
import africa.semicolon.blogApplication.data.models.Author;

import java.util.List;

public interface AuthorService {

    CreateAuthorResponse createAuthor(CreateAuthorRequest authorRequestDto);
    Author updateAuthor(String authorId, CreateAuthorRequest authorRequestDto);
    List<Author>findAllAuthors();
    void deleteAuthorById(String id);
    Author findAuthorById(String id);
}
