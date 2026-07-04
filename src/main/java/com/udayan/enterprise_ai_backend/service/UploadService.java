package com.udayan.enterprise_ai_backend.service;

import com.udayan.enterprise_ai_backend.client.PythonClient;
import com.udayan.enterprise_ai_backend.dto.UploadResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class UploadService {

    private final PythonClient pythonClient;

    public UploadService(PythonClient pythonClient) {
        this.pythonClient = pythonClient;
    }

    public UploadResponse upload(MultipartFile file) throws IOException {

        return pythonClient.upload(file);

    }
}