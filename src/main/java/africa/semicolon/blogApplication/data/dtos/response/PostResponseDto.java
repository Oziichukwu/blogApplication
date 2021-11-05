package africa.semicolon.blogApplication.data.dtos.response;

import africa.semicolon.blogApplication.data.models.Author;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostResponseDto {

    private String title;

    private String content;

    private String authorId;

    private String postId;

    private String datePostWasCreated;


}
