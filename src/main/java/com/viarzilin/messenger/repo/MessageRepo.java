package com.viarzilin.messenger.repo;

import com.viarzilin.messenger.domain.Message;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Long> {

    @EntityGraph(attributePaths = { "comments" })
    List<Message> findAll();



}
