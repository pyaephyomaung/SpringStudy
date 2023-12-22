package com.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Role {

    @Value("FileInject_Role")
    private String name;

    public String getName(){
        return name;
    }
}
