package com.example.homework.first.sameTypeBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    public Interface FirstImplementation() {
        Implementation i = new Implementation("Implementation without @Primary");
        System.out.println(i.getMessage());
        return i;
    }

    @Bean
    @Primary
    public Interface SecondImplementation() {
        Implementation i = new Implementation("Implementation with @Primary");
        System.out.println(i.getMessage());
        return i;
    }

    @Bean
    @Qualifier("first")
    public Interface Tr(){
        Implementation i = new Implementation("Implementation with first @Qualifier");
        System.out.println(i.getMessage());
        return i;
    }

    @Bean
    @Qualifier("second")
    public Interface Trr(){
        Implementation i = new Implementation("Implementation with second @Qualifier");
        System.out.println(i.getMessage());
        return i;
    }
}
