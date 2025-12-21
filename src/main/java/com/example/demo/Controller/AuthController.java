package com.example.demo.controller;

import com.example.demo.entity.Auth;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public Auth register(@RequestParam String username,
                         @RequestParam String password) {
        return userService.register(username, password);
    }

    @PostMapping("/login")
    public Auth login(@RequestParam String username,
                      @RequestParam String password) {
        return userService.login(username, password);
    }
}
