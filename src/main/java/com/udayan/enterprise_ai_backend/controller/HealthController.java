package com.udayan.enterprise_ai_backend.controller;

import com.udayan.enterprise_ai_backend.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/api/health")
    public String health() {

        return healthService.health();
    }
}