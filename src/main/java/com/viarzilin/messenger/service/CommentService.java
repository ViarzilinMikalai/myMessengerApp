package com.viarzilin.messenger.service;

import com.viarzilin.messenger.domain.Comment;
import com.viarzilin.messenger.domain.User;
import com.viarzilin.messenger.domain.Views;
import com.viarzilin.messenger.dto.EventType;
import com.viarzilin.messenger.dto.ObjectType;
import com.viarzilin.messenger.repo.CommentRepo;
import com.viarzilin.messenger.util.WsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.BiConsumer;

@Service
public class CommentService {
    private final CommentRepo commentRepo;
    private final BiConsumer<EventType, Comment> wsSender;

    @Autowired
    public CommentService(CommentRepo commentRepo, WsSender wsSender) {
        this.commentRepo = commentRepo;
        this.wsSender = wsSender.getSender(ObjectType.COMMENT, Views.FullComment.class);
    }

    public Comment create(Comment comment, User user) {
        comment.setAuthor(user);
        Comment commentFromDb = commentRepo.save(comment);

        wsSender.accept(EventType.CREATE, commentFromDb);

        return commentFromDb;
    }
}
