package com.example.demo.service;

import com.example.demo.entity.Auth;

public interface UserService {
    Auth register(String username, String password);
}
