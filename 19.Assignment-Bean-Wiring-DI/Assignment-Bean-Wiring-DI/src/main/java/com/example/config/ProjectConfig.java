package com.example.config;

import com.example.bean.Person;
import com.example.bean.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.interfaces","com.example.impl","com.example.services"})
@ComponentScan(basePackageClasses = {Vehicle.class, Person.class})
public class ProjectConfig {
}
