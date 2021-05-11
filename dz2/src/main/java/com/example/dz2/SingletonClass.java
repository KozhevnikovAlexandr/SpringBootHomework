package com.example.dz2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonClass {
    private String text;
    public int number;

    public SingletonClass(){
        number = (int)(Math.random() * 100);
    }

    public int getNumber(){
        return number;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
