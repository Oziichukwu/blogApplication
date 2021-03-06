package africa.semicolon.blogApplication.data.dtos.request;

import lombok.Data;

@Data
public class CommentRequestDto {
    private String commentId;
    private String commentorName;
    private String content;
    private String dateCommentWasMade;
}
