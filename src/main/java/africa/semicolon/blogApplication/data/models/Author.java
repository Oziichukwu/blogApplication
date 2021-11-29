package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class  Author {
    private String profession;
    private String authorId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phoneNumber;
}
