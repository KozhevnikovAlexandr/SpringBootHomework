package com.example.thrid;

import com.example.thrid.SmsSender.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfiguration {

    @Autowired
    private SmsSender smsSender;

    @Bean
    public void sendSms(){
        smsSender.send("+79000000000", "text");
    }

}
