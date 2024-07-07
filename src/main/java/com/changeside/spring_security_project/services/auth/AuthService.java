package com.changeside.spring_security_project.services.auth;

import com.changeside.spring_security_project.models.dto.request.LoginRequest;
import com.changeside.spring_security_project.models.dto.request.RegisterRequest;
import com.changeside.spring_security_project.models.dto.response.LoginResponse;
import com.changeside.spring_security_project.models.dto.response.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest registerRequest);

    LoginResponse login(LoginRequest loginRequest);
}
