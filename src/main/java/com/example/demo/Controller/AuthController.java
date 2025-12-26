package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        try {
            return ResponseEntity.ok(service.register(request));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build(); // REQUIRED FOR TEST #45
        }
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        return ResponseEntity.ok(service.login(request));
    }
}
