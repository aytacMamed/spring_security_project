package com.changeside.spring_security_project.models.dto.response;

import lombok.Data;


public class RegisterResponse {
    private String message;

    public RegisterResponse(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
}
