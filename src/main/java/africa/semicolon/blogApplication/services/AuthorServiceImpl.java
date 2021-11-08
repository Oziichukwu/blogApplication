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
    public Author updateAuthor(String id, AuthorRequestDto authorRequestDto) {

        Author authorToBeUpdated = findAuthorById(id);
        if (!authorToBeUpdated.getFirstName().equals(authorRequestDto.getFirstName())){
            authorToBeUpdated.setFirstName(authorRequestDto.getFirstName());
        }
        if (!authorToBeUpdated.getLastName().equals(authorRequestDto.getLastName())){
            authorToBeUpdated.setLastName(authorRequestDto.getLastName());
        }
        if (!authorToBeUpdated.getPhoneNumber().equals(authorRequestDto.getPhoneNumber())){
            authorToBeUpdated.setPhoneNumber(authorRequestDto.getPhoneNumber());
        }

        if (!authorToBeUpdated.getProfession().equals(authorRequestDto.getProfession())){
            authorToBeUpdated.setProfession(authorRequestDto.getProfession());
        }
        if (!authorToBeUpdated.getEmail().equals(authorRequestDto.getEmail())){
            authorToBeUpdated.setProfession(authorRequestDto.getProfession());
        }
        return authorRepository.save(authorToBeUpdated);
    }

    @Override
    public List<Author> findById() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteAuthorById(String id) {
        Author deletedAuthor = authorRepository.findByAuthorId(id);
        authorRepository.delete(deletedAuthor);
    }

    @Override
    public void deleteAuthor(Author author) {
        authorRepository.delete(author);
    }

    @Override
    public Author findAuthorById(String id) {

        return authorRepository.findByAuthorId(id);
    }
}
