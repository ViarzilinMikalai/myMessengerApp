package com.viarzilin.messenger.repo;

import com.viarzilin.messenger.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
