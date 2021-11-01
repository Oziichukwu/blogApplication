package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Comment {

    private String commentUniqueId;
    private String commentorName;
    private String content;
    private LocalDate dateCreated;
}
