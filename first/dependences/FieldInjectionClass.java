package com.example.homework.first.dependences;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionClass {

    @Autowired
    private JustClass data;

    JustClass getData(){
        return data;
    }

    void setData(JustClass data){
        this.data = data;
    }
}
