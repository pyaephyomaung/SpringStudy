package com.example.impl;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String playMusic() {
        return "Playing Boose Speaker Music";
    }
}
