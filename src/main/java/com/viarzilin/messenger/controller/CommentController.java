package com.viarzilin.messenger.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.viarzilin.messenger.domain.Comment;
import com.viarzilin.messenger.domain.User;
import com.viarzilin.messenger.domain.Views;
import com.viarzilin.messenger.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comment")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    @JsonView(Views.FullMessage.class)
    public Comment create(
            @RequestBody Comment comment,
            @AuthenticationPrincipal User user
    ) {
        return commentService.create(comment, user);
    }
    @GetMapping
    public String add(){
        return null;
    }


}
