package com.example.config;

import com.example.bean.Person;
import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.bean")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("V1");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("V2");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("V3");
        return vehicle;
    }

}
