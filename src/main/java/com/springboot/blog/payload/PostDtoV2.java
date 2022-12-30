//package com.springboot.blog.payload;
//
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Size;
//import lombok.Data;
//
//import java.util.List;
//import java.util.Set;
//
//@Data
//public class PostDtoV2 {
//    private long id;
//
//    // title should not be null or empty
//    // title should have at least 2 characters
//    @NotEmpty
//    @Size(min = 2, message = "Post title should have at least 2 characters")
//    private String title;
//
//    // post description should not be null or empty
//    // post description should have at least 2 characters
//    @NotEmpty
//    @Size(min = 10, message = "Post title should have at least 10 characters")
//    private String description;
//
//    // post content should not be null or empty
//    @NotEmpty
//    private String content;
//    private Set<CommentDto> comments;
//    private List<String> tags;
//
//}
