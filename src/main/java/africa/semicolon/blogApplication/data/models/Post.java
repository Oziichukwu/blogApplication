package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
public class Post {
    private String content;
    private String title;
    private String PostId;
    private String localDateTime;
    private String authorId;
    //private Author author;
    //private List<Comment> comments  = new ArrayList<>();

    public void setLocalDateTime(String localDateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.localDateTime = LocalDateTime.now().format(dateTimeFormatter);
    }
}
