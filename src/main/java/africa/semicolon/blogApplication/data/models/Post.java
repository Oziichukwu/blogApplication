package africa.semicolon.blogApplication.data.models;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String content;
    private String title;
    private long id;
    private Author author;
    private List<Comment> comments  = new ArrayList<>();

}
