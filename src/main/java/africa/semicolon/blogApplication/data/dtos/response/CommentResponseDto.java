package africa.semicolon.blogApplication.data.dtos.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentResponseDto {
    private String commentorName;
    private String content;
    private LocalDateTime dateCommentWasMade;
}
