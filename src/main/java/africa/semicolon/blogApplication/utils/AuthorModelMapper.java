package africa.semicolon.blogApplication.utils;

import africa.semicolon.blogApplication.data.dtos.request.AuthorRequestDto;
import africa.semicolon.blogApplication.data.dtos.response.AuthorResponseDto;
import africa.semicolon.blogApplication.data.models.Author;

public class AuthorModelMapper {

    public static Author map(AuthorRequestDto authorRequestDto){

        Author author = new Author();

        author.setAuthorId(authorRequestDto.getAuthorId());
        author.setUserName(authorRequestDto.getUserName());
        author.setFirstName(authorRequestDto.getFirstName());
        author.setLastName(authorRequestDto.getUserName());
        author.setProfession(authorRequestDto.getProfession());
        author.setPhoneNumber(authorRequestDto.getPhoneNumber());
        return author;
    }

    public static AuthorResponseDto map(Author savedAuthor){

        AuthorResponseDto response = new AuthorResponseDto();
        response.setAuthorId(savedAuthor.getAuthorId());
        response.setFirstName(savedAuthor.getFirstName());
        response.setUserName(savedAuthor.getUserName());
        response.setEmail(savedAuthor.getEmail());
        return response;
    }
}
