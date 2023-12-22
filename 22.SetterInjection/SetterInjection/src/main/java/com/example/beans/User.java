package com.example.beans;

public class User {

    private String name;

    private Role role;

    public void setName(String name){
        this.name = name;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public Role getRole(){
        return role;
    }
}
