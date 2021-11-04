package africa.semicolon.blogApplication.data.dtos.request;

import lombok.Data;

@Data
public class CommentRequestDto {
    private String commentorName;
    private String content;
}
