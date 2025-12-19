package com.example.demo.service;

import com.example.demo.RegisterRequest;
import com.example.demo.entity.User;
public interface UserService{
    User register(RegisterRequest request);
    User login(AuthRequest request);
    User getByEmail(String email);
}