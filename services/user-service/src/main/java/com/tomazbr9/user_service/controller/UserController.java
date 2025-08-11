package com.tomazbr9.user_service.controller;

import com.tomazbr9.user_service.model.User;
import com.tomazbr9.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok(obj);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User obj = service.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }
}
