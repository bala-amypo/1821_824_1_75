package com.example.demo.service.impl;

import com.example.demo.entity.Auth;
import com.example.demo.repository.AuthRepository;
import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthRepository authRepository;

    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public Auth register(String username, String password) {

        if (authRepository.findByUsername(username).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        Auth auth = new Auth(username, password);
        return authRepository.save(auth);
    }

    @Override
    public Auth login(String username, String password) {

        Auth auth = authRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!auth.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return auth;
    }
}
