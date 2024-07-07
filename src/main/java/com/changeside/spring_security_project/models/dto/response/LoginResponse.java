package com.changeside.spring_security_project.models.dto.response;

import lombok.Data;


public class LoginResponse {
    private String token;
    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
