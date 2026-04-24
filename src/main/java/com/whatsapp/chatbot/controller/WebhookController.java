package com.whatsapp.chatbot.controller;

import com.whatsapp.chatbot.dto.MessageRequest;
import com.whatsapp.chatbot.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/webhook")
@RequiredArgsConstructor
@Slf4j
public class WebhookController {

    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<Map<String, String>> receiveMessage(@RequestBody MessageRequest request) {
        log.info("Received webhook request: {}", request);
        Map<String, String> response= messageService.sendMessage(request);

        return ResponseEntity.ok(response);
    }
}
