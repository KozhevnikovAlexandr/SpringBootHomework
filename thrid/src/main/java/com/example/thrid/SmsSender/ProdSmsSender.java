package com.example.thrid.SmsSender;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class ProdSmsSender implements SmsSender{

    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("its prod profile");
        System.out.println(phoneNumber);
        System.out.println(text);
    }
}
