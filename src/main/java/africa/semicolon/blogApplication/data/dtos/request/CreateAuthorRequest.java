package africa.semicolon.blogApplication.data.dtos.request;

import lombok.Data;

@Data
public class CreateAuthorRequest {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phoneNumber;
    private String profession;
}
