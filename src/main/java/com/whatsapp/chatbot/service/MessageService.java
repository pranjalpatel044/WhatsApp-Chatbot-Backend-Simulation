package com.whatsapp.chatbot.service;

import com.whatsapp.chatbot.dto.MessageRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class MessageService {

    public Map<String, String> sendMessage(MessageRequest request) {

        String sender = request.getSender();
        String message = request.getMessage();
        log.info("Received message form sender {}: message {}", sender, message);

        String incomingText = request.getMessage().trim();
        String replyText;

        // predefined replies
        if(incomingText.equalsIgnoreCase("Hi")) {
            replyText = "Hello";
        } else if (incomingText.equalsIgnoreCase("Bye")) {
            replyText = "Goodbye";
        } else {
            replyText = "Default response: How can I help you?";
        }

        log.debug("Reply sent to {} -> {}", sender, message);

        Map<String, String> response = new HashMap<>();
        response.put("reply", replyText);

        return response;
    }
}
