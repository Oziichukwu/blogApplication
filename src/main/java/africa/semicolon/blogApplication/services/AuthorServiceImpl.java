package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.dtos.request.CreateAuthorRequest;
import africa.semicolon.blogApplication.data.dtos.response.CreateAuthorResponse;
import africa.semicolon.blogApplication.data.models.Author;
import africa.semicolon.blogApplication.data.repositories.AuthorRepository;
import africa.semicolon.blogApplication.data.repositories.AuthorRepositoryImpl;
import africa.semicolon.blogApplication.utils.AuthorModelMapper;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository = new AuthorRepositoryImpl();

    @Override
    public CreateAuthorResponse createAuthor(CreateAuthorRequest authorRequestDto) {

        Author author = AuthorModelMapper.map(authorRequestDto);

        Author savedAuthor = authorRepository.save(author);

        return AuthorModelMapper.map(savedAuthor);
    }

    @Override
    public Author updateAuthor(String authorId, CreateAuthorRequest authorRequestDto) {

        Author authorToBeUpdated = findAuthorById(authorId);
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
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteAuthorById(String id) {
        //Author deletedAuthor = authorRepository.findByAuthorId(id);
       // authorRepository.delete(deletedAuthor);

    }


    @Override
    public Author findAuthorById(String id) {

        //return authorRepository.findByAuthorId(id);
        return null;
    }
}
