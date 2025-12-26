package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getByUsername(String username) {
        return null; // later connect repository
    }

    @Override
    public AuthResponse register(RegisterRequest request) {
        // TEMP implementation (to fix compile error)
        return new AuthResponse("REGISTER_SUCCESS");
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        // TEMP implementation (to fix compile error)
        return new AuthResponse("LOGIN_SUCCESS");
    }
}
