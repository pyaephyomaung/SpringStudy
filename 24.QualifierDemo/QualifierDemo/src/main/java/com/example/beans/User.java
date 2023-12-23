package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("QualifierDemo_User")
    private String name;

    private RoleInterface role;

    public String getName(){
        return name;
    }

    public RoleInterface getRole(){
        return role;
    }

    @Autowired
    public void setRole(@Qualifier("emplRole") RoleInterface role){
        this.role = role;
    }
}
