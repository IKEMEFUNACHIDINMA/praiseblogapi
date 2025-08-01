package com.example.cwblog.controller;

import com.example.cwblog.dto.Logindto;
import com.example.cwblog.model.User;
import com.example.cwblog.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

     @Autowired
     private UserService userService;

     @PostMapping("/register")
    public User registerUser(@RequestBody User user){
         userService.registerUser(user);
         return user;
     }

     //Login by id
    @PostMapping("/login")
    public String loginUser( @RequestBody Logindto user){
         userService.loginUser(user);
         return "Login successful";
    }
}
