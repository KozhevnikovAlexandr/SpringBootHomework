package com.example.thrid.SmsSender;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevSmsSender implements SmsSender{

    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("its dev profile");
        System.out.println(phoneNumber);
        System.out.println(text);
    }
}