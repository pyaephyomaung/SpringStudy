package com.example.impl;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BooseSpeakers implements Speakers {
    @Override
    public String playMusic() {
        return "Playing Boose Speaker Music";
    }
}
