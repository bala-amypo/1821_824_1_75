// package com.example.demo.controller;

// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.dto.AuthRequest;
// import com.example.demo.entity.User;
// import com.example.demo.service.UserService;

// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;

// @RestController
// @RequestMapping("/api/users")
// public class UserController {

//     private final UserService userService;

//     public UserController(UserService userService) {
//         this.userService = userService;
//     }

//     // Register a new user
//     @PostMapping("/register")
//     public User register(@RequestBody RegisterRequest request) {
//         return userService.register(request);
//     }

//     // Login user
//     @PostMapping("/login")
//     public User login(@RequestBody AuthRequest request) {
//         return userService.login(request);
//     }

//     // Get user by email
//     @GetMapping("/{email}")
//     public User getUserByEmail(@PathVariable String email) {
//         return userService.getByEmail(email);
//     }
// }
