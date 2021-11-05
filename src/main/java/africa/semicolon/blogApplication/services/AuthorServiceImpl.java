package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.AuthorRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.AuthorResponseDto;
import africa.semicolon.blogApplication.data.models.Author;
import africa.semicolon.blogApplication.data.repositories.AuthorRepository;
import africa.semicolon.blogApplication.data.repositories.AuthorRepositoryImpl;
import africa.semicolon.blogApplication.utils.AuthorModelMapper;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository = new AuthorRepositoryImpl();

    @Override
    public AuthorResponseDto createAuthor(AuthorRequestDto authorRequestDto) {

        Author author = AuthorModelMapper.map(authorRequestDto);

        Author savedAuthor = authorRepository.save(author);

        AuthorResponseDto responseDto = AuthorModelMapper.map(savedAuthor);

        return responseDto;
    }

    @Override
    public AuthorResponseDto updateAuthor(AuthorRequestDto authorRequestDto) {
        return null;
    }

    @Override
    public List<Author> findById() {
        return null;
    }

    @Override
    public void deleteAuthorById(String id) {

    }

    @Override
    public void deleteAuthor(Author author) {

    }

    @Override
    public Author findAuthorById(String id) {
        return null;
    }
}
