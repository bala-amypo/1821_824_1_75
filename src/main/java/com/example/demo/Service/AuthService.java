package com.example.demo.service;

import com.example.demo.entity.Auth;

public interface AuthService {

    Auth register(String username, String password);

    Auth login(String username, String password);
}
