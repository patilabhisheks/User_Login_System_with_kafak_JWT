package com.example.user_login.controller;

import com.example.user_login.dto.LogIn;
import com.example.user_login.model.User;
import com.example.user_login.service.UserService;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user)
    {

        User savedUser = userService.creteUser(user);

        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/user")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }

    @PostMapping("/login")
    public ResponseEntity<User> createLogin(@RequestBody LogIn logIn)
    {
        User getLogin =userService.createLogin(logIn);
        return ResponseEntity.ok(getLogin);
    }
}
