package com.example;

import com.example.bean.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        person.getVehicle().getVehicleService().playSound();
        person.getVehicle().getVehicleService().moveVehicle();

    }
}
