package com.example.expensplit.controller;

import com.example.expensplit.UserServices;
import com.example.expensplit.model.User;
import com.example.expensplit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myapp/ui")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping(value = "/user")
    public User getUser(){
        User user = new User();
        user.setUsername("ThakurAbhishek");
        user.setEmail("abhishekaman02@gmail.com");
        return user;
    }
    @GetMapping(value = "/allusers")
    public List<User> getAllUser(){
        return userServices.getUsers();
    }
}
