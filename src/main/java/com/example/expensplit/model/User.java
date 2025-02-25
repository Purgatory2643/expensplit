package com.example.expensplit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String user_id;
    private String username;
    private String email;
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
