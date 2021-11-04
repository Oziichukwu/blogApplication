package africa.semicolon.blogApplication.data.dtos.response;

import lombok.Data;

@Data
public class PostResponseDto {

    private String title;

    private String content;

    private String authorId;
}
