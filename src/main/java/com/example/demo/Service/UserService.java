package com.example.demo.service;
import com.example.demo.AuthRequest;

import com.example.demo.RegisterRequest;
import com.example.demo.entity.User;
public interface UserService{
    User register(RegisterRequest request);
    AuthResponse login(AuthRequest request);
    User getByEmail(String email);
}