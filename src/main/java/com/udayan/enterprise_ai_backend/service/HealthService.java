package com.udayan.enterprise_ai_backend.service;

import com.udayan.enterprise_ai_backend.client.PythonClient;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private final PythonClient pythonClient;

    public HealthService(PythonClient pythonClient) {
        this.pythonClient = pythonClient;
    }

    public String health() {

        return pythonClient.health();
    }
}