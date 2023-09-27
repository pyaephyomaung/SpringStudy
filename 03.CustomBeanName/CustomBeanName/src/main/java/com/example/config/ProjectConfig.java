package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){

        Vehicle vehicle = new Vehicle();
        vehicle.setName("AAA");

        return vehicle;

    }

    @Bean
    Vehicle vehicle1(){

        Vehicle vehicle = new Vehicle();
        vehicle.setName("BBB");

        return vehicle;

    }

    @Bean
    Vehicle vehicle2(){

        Vehicle vehicle = new Vehicle();
        vehicle.setName("CCC");

        return vehicle;

    }
}
