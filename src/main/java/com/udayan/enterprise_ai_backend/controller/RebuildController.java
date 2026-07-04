package com.udayan.enterprise_ai_backend.controller;

import com.udayan.enterprise_ai_backend.client.PythonClient;
import com.udayan.enterprise_ai_backend.dto.RebuildResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RebuildController {

    private final PythonClient pythonClient;

    public RebuildController(PythonClient pythonClient) {
        this.pythonClient = pythonClient;
    }

    @PostMapping("/rebuild")
    public RebuildResponse rebuild() {

        return pythonClient.rebuild();

    }
}
