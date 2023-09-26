package com.ppm.firstmaven.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("39 Bike Pu");
        return vehicle;
    }

    @Bean
    String sayHello(){
        return "Hello Guys";
    }
}
