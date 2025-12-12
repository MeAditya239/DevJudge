package com.devjudge.controller;

import com.devjudge.dto.LoginRequest;
import com.devjudge.dto.RegisterRequest;
import com.devjudge.entity.Role;
import com.devjudge.entity.User;
import com.devjudge.repository.UserRepository;
import com.devjudge.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

// CodeRabbit test review comment


@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "Email already exists!";
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.valueOf(request.getRole())); // e.g. "TRAINER"

        userRepository.save(user);
        return "User Registered Successfully!";
    }

//


    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest request) {

        System.out.println("======= LOGIN DEBUG START =======");
        System.out.println("Email from Postman: " + request.getEmail());
        System.out.println("Password from Postman: " + request.getPassword());

        Optional<User> userOpt = userRepository.findByEmail(request.getEmail());

        if (userOpt.isEmpty()) {
            System.out.println("USER NOT FOUND IN DB");
            throw new RuntimeException("Invalid Email");
        }

        User user = userOpt.get();

        System.out.println("User found: " + user.getEmail());
        System.out.println("Hashed password in DB: " + user.getPassword());
        System.out.println("Role in DB: " + user.getRole());

        boolean match = passwordEncoder.matches(request.getPassword(), user.getPassword());
        System.out.println("Password match result: " + match);

        if (!match) {
            throw new RuntimeException("Invalid Password");
        }

        String token = jwtUtil.generateToken(
                user.getId(),
                user.getEmail(),
                user.getRole().name()
        );

        System.out.println("JWT Token generated successfully");

        // IMPORTANT: Do NOT use Map.of for now (it causes 500 if any value is null)
        Map<String, Object> response = new java.util.HashMap<>();
        response.put("token", token);
        response.put("role", user.getRole());
        response.put("name", user.getName());
        response.put("id", user.getId());

        System.out.println("======= LOGIN DEBUG END =======");

        return response;
    }

}
