package africa.semicolon.blogApplication.data.dtos.response;

import lombok.Data;

@Data
public class AuthorResponseDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String authorId;

}
