package com.example.homework.first.sameTypeBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Qualifier №2")
public class Qualifier2 implements Interface{

    public Qualifier2(){
    }

    public String getMessage(){
        return "abc";
    }
}
