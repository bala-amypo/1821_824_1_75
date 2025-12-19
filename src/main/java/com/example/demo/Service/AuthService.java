package com.example.demo.service;

import com.example.demo.entity.User;

public interface AuthService {

    User register(String username, String password);

    User login(String username, String password);
}
