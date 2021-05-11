package com.example.dz2;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestData {
    private int number;

    public RequestData(){
        this.number = (int)(Math.random() * 100);
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
