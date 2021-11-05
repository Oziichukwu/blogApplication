package africa.semicolon.blogApplication.data.dtos.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentResponseDto {
    private String commentId;
    private String commentorName;
    private String content;
    private String dateCommentWasMade;
}
