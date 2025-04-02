package com.sap.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ApiResponse<T> {
    private int status;
    private String message;
    private LocalDateTime timeStamp;
    private List<T> payload;

    public ApiResponse(int status, String message, List<T> payload) {
        this.status = status;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
        this.payload = payload;
    }

    

    public ApiResponse(int status, String message) {
        this.status = status;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<T> getPayload() {
        return payload;
    }

    public void setPayload(List<T> payload) {
        this.payload = payload;
    }
}
