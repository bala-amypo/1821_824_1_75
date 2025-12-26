package com.example.demo.service;

import com.example.demo.dto.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void register(RegisterRequest request) {
        // dummy implementation
    }

    public AuthResponse login(AuthRequest request) {
        return new AuthResponse("dummy-jwt-token");
    }
}
