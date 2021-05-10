package com.example.homework.first;

import com.example.homework.first.sameTypeBeans.Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

    @Autowired
    @Qualifier("first")
    public Interface anInterface1;

    @Autowired
    @Qualifier("second")
    public Interface anInterface2;

    @Autowired
    private Interface anInterface3;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }
}
