package africa.semicolon.blogApplication.data.dtos.request;

import africa.semicolon.blogApplication.data.models.Author;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostRequestDto {

    private String postId;

    private String title;

    private String content;

    private String authorId;

    private Author author;

    private String datePostWasCreated;
}
