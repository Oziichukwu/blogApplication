package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Post {
    private String content;
    private String title;
    private String PostId;
    private Author author;
    private List<Comment> comments  = new ArrayList<>();

}
