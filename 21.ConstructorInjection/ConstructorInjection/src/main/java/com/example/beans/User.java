package com.example.beans;

public class User {

    private String name;

    private Role role;

    public User(String name , Role role){
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public Role getRole(){
        return role;
    }
}
