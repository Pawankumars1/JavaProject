package com.example.Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Backend.model.User;
import com.example.Backend.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:8081")  
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User addUser(@RequestBody User user) {
    	 System.out.println("Saved Successfully");
        return userRepository.save(user);
       
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}