package africa.semicolon.blogApplication.data.dtos.request;

import lombok.Data;

@Data
public class PostRequestDto {

    private String title;

    private String content;

    private String authorId;
}
