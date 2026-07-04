package com.udayan.enterprise_ai_backend.dto;

public class RebuildResponse {

    private String message;

    public RebuildResponse() {
    }

    public RebuildResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}