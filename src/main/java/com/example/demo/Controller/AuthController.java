package com.example.demo.controller;

import com.example.demo.entity.Auth;
import com.example.demo.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public Auth register(@RequestParam String username,
                         @RequestParam String password) {
        return authService.register(username, password);
    }

    @PostMapping("/login")
    public Auth login(@RequestParam String username,
                      @RequestParam String password) {
        return authService.login(username, password);
    }
}
