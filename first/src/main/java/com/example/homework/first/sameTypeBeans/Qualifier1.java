package com.example.homework.first.sameTypeBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Qualifier №1")
public class Qualifier1 implements Interface{

    public Qualifier1(){
    }

    public String getMessage(){
        return "abc";
    }
}
