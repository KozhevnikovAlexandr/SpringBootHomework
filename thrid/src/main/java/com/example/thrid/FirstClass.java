package com.example.thrid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class FirstClass {
    private int firstConfig;

    public int getFirstConfig() {
        return firstConfig;
    }

    public void setFirstConfig(int firstConfig) {
        this.firstConfig = firstConfig;
    }
}
