package com.udayan.enterprise_ai_backend.controller;

import com.udayan.enterprise_ai_backend.dto.UploadResponse;
import com.udayan.enterprise_ai_backend.service.UploadService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class UploadController {

    private final UploadService uploadService;

    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @PostMapping(
            value = "/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public UploadResponse upload(
            @RequestPart("file") MultipartFile file
    ) throws IOException {

        return uploadService.upload(file);

    }
}