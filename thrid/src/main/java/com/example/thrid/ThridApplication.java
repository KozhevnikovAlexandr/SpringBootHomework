package com.example.thrid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.event.EventListener;

@EnableConfigurationProperties
@SpringBootApplication
public class ThridApplication {

    @Autowired
    private AppEventListener appEventListener;

    @Autowired
    private SimpleConfig simpleConfig;

    @Autowired
    private SmsConfiguration smsConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ThridApplication.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void appStart(){
        appEventListener.simpleConfig(new SimpleConfigEvent(simpleConfig));
    }

}
