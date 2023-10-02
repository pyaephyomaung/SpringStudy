package com.example.impl;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SiamTyres implements Tyres {
    @Override
    public String rotate() {
        return "Rotating Siam Tyres";
    }
}
