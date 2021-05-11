package com.example.dz2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeClass {
    private String text;

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
