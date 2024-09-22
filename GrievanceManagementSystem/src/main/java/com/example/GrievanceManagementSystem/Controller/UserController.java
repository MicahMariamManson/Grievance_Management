package com.example.GrievanceManagementSystem.Controller;

import com.example.GrievanceManagementSystem.Services.UserService;
import com.example.GrievanceManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> register(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }
}

