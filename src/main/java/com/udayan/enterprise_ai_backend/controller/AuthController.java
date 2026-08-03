package com.udayan.enterprise_ai_backend.controller;

import com.udayan.enterprise_ai_backend.dto.AuthResponse;
import com.udayan.enterprise_ai_backend.dto.LoginRequest;
import com.udayan.enterprise_ai_backend.dto.RegisterRequest;
import com.udayan.enterprise_ai_backend.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@Valid @RequestBody RegisterRequest request) {

        return authService.register(request);

    }

    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }

}
