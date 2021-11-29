package africa.semicolon.blogApplication.utils;

import africa.semicolon.blogApplication.data.dtos.request.CreateAuthorRequest;
import africa.semicolon.blogApplication.data.dtos.response.CreateAuthorResponse;
import africa.semicolon.blogApplication.data.models.Author;

public class AuthorModelMapper {

    public static Author map(CreateAuthorRequest createAuthorRequest){

        Author author = new Author();
        author.setUserName(createAuthorRequest.getUserName());
        author.setFirstName(createAuthorRequest.getFirstName());
        author.setLastName(createAuthorRequest.getUserName());
        author.setProfession(createAuthorRequest.getProfession());
        author.setEmail(createAuthorRequest.getEmail());
        author.setPhoneNumber(createAuthorRequest.getPhoneNumber());
        return author;
    }

    public static CreateAuthorResponse map(Author savedAuthor){

        CreateAuthorResponse response = new CreateAuthorResponse();
        response.setAuthorId(savedAuthor.getAuthorId());
        response.setUserName(savedAuthor.getUserName());
        response.setEmail(savedAuthor.getEmail());
        return response;
    }
}
