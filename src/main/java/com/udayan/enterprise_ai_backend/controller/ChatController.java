package com.udayan.enterprise_ai_backend.controller;

import com.udayan.enterprise_ai_backend.dto.ChatRequest;
import com.udayan.enterprise_ai_backend.dto.ChatResponse;
import org.springframework.web.bind.annotation.*;
import com.udayan.enterprise_ai_backend.service.ChatService;

@RestController
@RequestMapping("/api")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody ChatRequest request) {

        return chatService.chat(request);

    }
}