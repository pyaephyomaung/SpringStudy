package com.example.config;

import com.example.beans.Role;
import com.example.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Role setter_Role(){
        Role role = new Role();
        role.setName("Setter_Role");
        return role;
    }

    @Bean
    public User setter_User(){
        User user = new User();
        user.setName("Setter_User");
        user.setRole(setter_Role());
        return user;
    }
}
