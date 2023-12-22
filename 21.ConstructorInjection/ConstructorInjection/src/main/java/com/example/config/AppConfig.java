package com.example.config;

import com.example.beans.Role;
import com.example.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Role constructor_role(){
        return new Role("constructor_role");
    }

    @Bean
    public User constructor_user(){
        return new User("constructor_user",constructor_role());
    }

}
