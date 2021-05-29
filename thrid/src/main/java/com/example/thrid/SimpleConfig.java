package com.example.thrid;

import org.springframework.stereotype.Component;

@Component
public class SimpleConfig {

    public SimpleConfig(FirstClass firstClass, SecondClass secondClass) {
        this.firstClass = firstClass;
        this.secondClass = secondClass;
    }

    private final FirstClass firstClass;
    private final SecondClass secondClass;

    public void printFirstClass(){
        System.out.println(firstClass.getFirstConfig());
    }

    public void printSecondClass(){
        System.out.println(secondClass.getSubconfig());
        System.out.println(secondClass.getUser());
        System.out.println(secondClass.getTtl());
    }

}
