package com.udayan.enterprise_ai_backend.client;

import com.udayan.enterprise_ai_backend.dto.ChatRequest;
import com.udayan.enterprise_ai_backend.dto.ChatResponse;
import com.udayan.enterprise_ai_backend.dto.RebuildResponse;
import com.udayan.enterprise_ai_backend.dto.UploadResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;

@Component
public class PythonClient {

    private final WebClient webClient;

    @Value("${python.service.url}")
    private String pythonServiceUrl;

    public PythonClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public String health() {

        return webClient
                .get()
                .uri(pythonServiceUrl + "/health")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public ChatResponse chat(ChatRequest request) {

        return webClient
                .post()
                .uri(pythonServiceUrl + "/chat")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(ChatResponse.class)
                .block();
    }

    public UploadResponse upload(MultipartFile file) throws IOException {

        MultipartBodyBuilder builder = new MultipartBodyBuilder();

        builder.part("file", new ByteArrayResource(file.getBytes()) {
            @Override
            public String getFilename() {
                return file.getOriginalFilename();
            }
        });

        return webClient
                .post()
                .uri(pythonServiceUrl + "/upload")
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .bodyValue(builder.build())
                .retrieve()
                .bodyToMono(UploadResponse.class)
                .block();
    }

    public RebuildResponse rebuild() {

        return webClient
                .post()
                .uri(pythonServiceUrl + "/rebuild")
                .retrieve()
                .bodyToMono(RebuildResponse.class)
                .block();

    }
}