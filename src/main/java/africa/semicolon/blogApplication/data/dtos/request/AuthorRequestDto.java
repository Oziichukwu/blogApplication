package africa.semicolon.blogApplication.data.dtos.request;

import lombok.Data;

@Data
public class AuthorRequestDto {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phoneNumber;

}
