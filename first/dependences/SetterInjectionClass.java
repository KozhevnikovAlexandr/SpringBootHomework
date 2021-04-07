package com.example.homework.first.dependences;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionClass {

    private JustClass data;

    @Autowired
    void setData(JustClass data){
        this.data = data;
    }

    JustClass getData(){
        return data;
    }
}
