package com.udayan.enterprise_ai_backend.dto;

public class UploadResponse {

    private String message;
    private String filename;
    private boolean duplicate;
    private boolean indexed;
    private Integer chunks;

    public UploadResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public boolean isDuplicate() {
        return duplicate;
    }

    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }

    public boolean isIndexed() {
        return indexed;
    }

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }

    public Integer getChunks() {
        return chunks;
    }

    public void setChunks(Integer chunks) {
        this.chunks = chunks;
    }
}