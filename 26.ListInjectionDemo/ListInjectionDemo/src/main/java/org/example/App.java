package org.example;

import org.example.beans.User;
import org.example.config.AppConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(AppConfig.class);
            context.scan("org.example.beans");

            User user = context.getBean("user", User.class);
            System.out.println("User IDs --> " + user.getOrderIds());

        }
        catch (BeansException | IllegalStateException e){
            e.printStackTrace();
        }
    }
}
