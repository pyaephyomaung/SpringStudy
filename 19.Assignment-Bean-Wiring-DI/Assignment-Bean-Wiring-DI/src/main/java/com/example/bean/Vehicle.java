package com.example.bean;

import com.example.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

    private String name = "Vox Wagon";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public VehicleService getVehicleService(){
        return vehicleService;
    }


}
