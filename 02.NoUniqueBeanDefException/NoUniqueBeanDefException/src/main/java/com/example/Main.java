package com.example;

import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean("A",Vehicle.class);
        System.out.println("Vehicle name is "+vehicle.getName());

        vehicle = context.getBean("B",Vehicle.class);
        System.out.println("Vehicle name is "+vehicle.getName());

        vehicle = context.getBean("C",Vehicle.class);
        System.out.println("Vehicle name is "+vehicle.getName());

    }
}
