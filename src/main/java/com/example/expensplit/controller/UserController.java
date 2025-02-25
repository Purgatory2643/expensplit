package com.example.expensplit.controller;

import com.example.expensplit.UserServices;
import com.example.expensplit.model.User;
import com.example.expensplit.repository.UserRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
