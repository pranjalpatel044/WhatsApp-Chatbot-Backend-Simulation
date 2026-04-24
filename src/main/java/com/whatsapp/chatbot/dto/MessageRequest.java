package com.whatsapp.chatbot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageRequest {
    private String sender;
    private String message;
}
