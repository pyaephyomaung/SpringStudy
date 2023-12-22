package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("FileInject_User")
    private String name;

    @Autowired
    private Role role;

    public String getName(){
        return name;
    }

    public Role getRole(){
        return  role;
    }
}
