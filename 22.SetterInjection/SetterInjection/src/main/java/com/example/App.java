package com.example;

import com.example.beans.User;
import com.example.config.AppConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(AppConfig.class);

            User user = (User) context.getBean("setter_User", User.class);
            System.out.println("User's Name = " + user.getName()+ " | User's Role = " + user.getRole().getName());
        }
        catch (BeansException | IllegalStateException e){
            e.printStackTrace();
        }
    }
}
