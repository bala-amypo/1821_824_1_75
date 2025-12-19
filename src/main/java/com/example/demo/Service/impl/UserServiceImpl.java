// package com.example.demo.service.impl;

// import org.springframework.stereotype.Service;

// import com.example.demo.dto.AuthRequest;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.entity.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;

// @Service
// public class UserServiceImpl implements UserService {

//     private final UserRepository userRepository;

//     public UserServiceImpl(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @Override
//     public User register(RegisterRequest request) {
//         User user = new User();
//         user.setName(request.getName());
//         user.setEmail(request.getEmail());
//         user.setPassword(request.getPassword());
//         return userRepository.save(user);
//     }

//     @Override
//     public User login(AuthRequest request) {
//         return userRepository.findByEmailAndPassword(
//                 request.getEmail(),
//                 request.getPassword()
//         );
//     }

//     @Override
//     public User getByEmail(String email) {
//         return userRepository.findByEmail(email);
//     }
// }
