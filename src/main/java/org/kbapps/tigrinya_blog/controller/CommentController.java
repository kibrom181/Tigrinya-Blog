package org.kbapps.tigrinya_blog.controller;

import lombok.RequiredArgsConstructor;
import org.kbapps.tigrinya_blog.model.Comment;
import org.kbapps.tigrinya_blog.service.CommentService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("comments")
public class CommentController {
    private final CommentService commentService;
    @GetMapping("/{id}")
    public List<Comment> getCommentsByPostId(@PathVariable Long id) {         //using DTO
        return commentService.getCommentsByPostId(id);
    }
    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {   //using DTO
        return commentService.createComment(comment);
    }
    @DeleteMapping("/{id}")
    public String deleteComment(@PathVariable Long id) {                //DTO not needed
        commentService.deleteComment(id);
        return "Comment deleted";
    }
    @PutMapping ("/{id}")                                            //using DTO
    public Comment updateComment(@RequestBody Comment comment, @PathVariable Long id) {
        return commentService.updateComment(comment, id);
    }

}
