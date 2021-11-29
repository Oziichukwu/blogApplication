package africa.semicolon.blogApplication.data.dtos.response;

import lombok.Data;

@Data
public class CreateAuthorResponse {
    private String userName;
    private String email;
    private String authorId;
}
