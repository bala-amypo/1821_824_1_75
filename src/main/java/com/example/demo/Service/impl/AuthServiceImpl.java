package com.example.demo.service.impl;

import com.example.demo.entity.Auth;
import com.example.demo.repository.AuthRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements UserService {

    private final AuthRepository authRepository;

    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public Auth register(String username, String password) {
        Auth auth = new Auth();
        auth.setUsername(username);
        auth.setPassword(password);
        return authRepository.save(auth);
    }
}
