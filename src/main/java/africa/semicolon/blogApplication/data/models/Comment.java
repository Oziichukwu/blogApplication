package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class Comment {
    private String postId;
    private String commentId;
    private String commentorName;
    private String content;
    private LocalDateTime dateCommentWasCreated = LocalDateTime.now();

//    public void setLocalDateTime(String localDateTime){
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
//        this.dateCommentWasCreated = LocalDateTime.now().format(dateTimeFormatter);
//    }
}
