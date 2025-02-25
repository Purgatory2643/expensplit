package com.example.expensplit.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Entity
@Slf4j
@Data
public class User {

    @Id
    private String user_id;
    private String username;
    private String email;
    @PrePersist
    public void generateUUID() {
        if (user_id == null) {
            user_id = UUID.randomUUID().toString();
        }
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
