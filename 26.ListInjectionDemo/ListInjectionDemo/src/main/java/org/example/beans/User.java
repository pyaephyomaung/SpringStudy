package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {

    @Autowired
    private List<String> orderIds;

    public List<String> getOrderIds(){
        return orderIds;
    }
}
