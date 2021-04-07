package com.example.homework.first.sameTypeBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    public Implementation FirstImplementation() {
        Implementation i = new Implementation("First");
        System.out.println(i.getMessage());
        return i;
    }

    @Primary
    @Bean
    public Implementation SecondImplementation() {
        Implementation i = new Implementation("Second");
        System.out.println(i.getMessage());
        return i;
    }
}
