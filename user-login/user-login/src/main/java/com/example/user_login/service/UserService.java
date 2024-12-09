package com.example.user_login.service;

import com.example.user_login.dto.LogIn;
import com.example.user_login.exception.UserValidationException;
import com.example.user_login.model.User;
import com.example.user_login.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private  UserRepository userRepository;

    public User creteUser(User user)
    {
        if(userRepository.existsByEmail(user.getEmail()))
        {
            throw new UserValidationException("Email already exists");
        }
        validatePassword(user.getPassword());
        return userRepository.save(user);
    }

    private void validatePassword(String password) {
        String passwordRegex ="^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$";
        if(!password.matches(passwordRegex))
        {
            throw new UserValidationException("Password should contain 8 elements");
        }
        password.matches(passwordRegex);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return  userRepository.findById(id).orElseThrow(()-> new UserValidationException("user not found with the Id:  "+id));
    }

    public User createLogin(LogIn logIn) {
        User user = userRepository.findByEmail(logIn.getEmail());
        if(!user.getPassword().equals(logIn.getPassword()))
        {
            throw new UserValidationException("Password is incorrect");
        }
        return user;
    }
}
