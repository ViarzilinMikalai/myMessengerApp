package com.viarzilin.messenger.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.viarzilin.messenger.domain.Message;
import com.viarzilin.messenger.domain.Views;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonView({Views.FullMessage.class})
public class MessagePageDto {
    private List<Message> messages;
    private int currentPage;
    private int totalPages;
}
