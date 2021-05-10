package com.example.homework.first.sameTypeBeans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Implementation implements Interface {

    private String message;

    public Implementation() {
    }

    public Implementation(String message){
        this.message = message;
    }

    @PostConstruct
    private void postConstruct(){
        System.out.println("Implementation PostConstruct");
    }

    @PreDestroy
    private void preDestroy(){
        System.out.println("Implementation PreDestroy");
    }

    @Override
    public String getMessage(){
        return message;
    }

}
