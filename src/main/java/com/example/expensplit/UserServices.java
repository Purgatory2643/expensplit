package com.example.expensplit;

import com.example.expensplit.model.User;
import com.example.expensplit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
}
