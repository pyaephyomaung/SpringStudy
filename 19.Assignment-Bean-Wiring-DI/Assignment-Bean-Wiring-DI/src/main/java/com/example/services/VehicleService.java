package com.example.services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleService")
public class VehicleService {

    @Autowired
    private Speakers speakers;

    private Tyres tyres;

    public void playSound(){
        String music = speakers.playMusic();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers(){
        return speakers;
    }

    public void setSpeakers(Speakers speakers){
        this.speakers = speakers;
    }

    public Tyres getTyres(){
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres){
        this.tyres = tyres;
    }
}
