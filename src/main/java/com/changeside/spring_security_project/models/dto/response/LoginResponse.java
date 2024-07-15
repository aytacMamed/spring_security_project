package com.changeside.spring_security_project.models.dto.response;


public class LoginResponse {
    private String accessToken;
    private String refreshToken;
    public LoginResponse(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
}
