package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private RoleInterface role;

    public RoleInterface getRole(){
        return role;
    }
}
