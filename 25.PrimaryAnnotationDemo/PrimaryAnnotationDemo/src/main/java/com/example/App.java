package com.example;

import com.example.beans.User;
import com.example.config.AppConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(AppConfig.class);
            context.scan("com.example.beans");

            User user = context.getBean("user", User.class);
            System.out.println("Role class Name = " + user.getRole().getClass());
        }catch(BeansException | IllegalStateException e){
            e.printStackTrace();
        }
    }
}
