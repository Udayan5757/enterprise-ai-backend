package com.udayan.enterprise_ai_backend.service;

import com.udayan.enterprise_ai_backend.client.PythonClient;
import com.udayan.enterprise_ai_backend.dto.ChatRequest;
import com.udayan.enterprise_ai_backend.dto.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final PythonClient pythonClient;

    public ChatService(PythonClient pythonClient) {
        this.pythonClient = pythonClient;
    }

    public ChatResponse chat(ChatRequest request) {
        return pythonClient.chat(request);
    }
}