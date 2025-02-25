package com.example.expensplit.controller;

import com.example.expensplit.Services.UserServices;
import com.example.expensplit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myapp/ui")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping(value = "/allusers")
    public List<User> getAllUser(){
        return userServices.getUsers();
    }
    @PostMapping("signup")
    public User registerUser(@RequestBody User user) {
        return userServices.saveUser(user);
    }
}
