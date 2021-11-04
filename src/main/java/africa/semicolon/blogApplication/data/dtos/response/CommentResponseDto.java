package africa.semicolon.blogApplication.data.dtos.response;

import lombok.Data;

@Data
public class CommentResponseDto {
    private String commentorName;
    private String content;
}
