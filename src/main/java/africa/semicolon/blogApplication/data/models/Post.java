package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Post {
    private String content;
    private String title;
    private String PostId;
    private LocalDateTime timePublished;
    private Author author;
    private List<Comment> comments  = new ArrayList<>();

}
