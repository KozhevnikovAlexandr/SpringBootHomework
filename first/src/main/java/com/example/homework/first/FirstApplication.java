package com.example.homework.first;

import com.example.homework.first.sameTypeBeans.Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

    @Autowired
    private Interface anInterface;

    public static void main(String[] args) {

        SpringApplication.run(FirstApplication.class, args);
    }
}
