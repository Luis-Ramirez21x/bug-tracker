package com.bugtracker.bugtracker.controller;


import com.bugtracker.bugtracker.model.User;
import com.bugtracker.bugtracker.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class UserController {

    @Autowired
    UserRepository repository;

    @PostMapping("/api/users")
    public User addUser(@RequestBody User user) {
        // Encrypt password
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
        repository.save(user);
        return user;
    }
}
