package com.example.thrid;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppEventListener {

    @EventListener(SimpleConfigEvent.class)
    public void simpleConfig(SimpleConfigEvent event){
        event.getSimpleConfig().printFirstClass();
        event.getSimpleConfig().printSecondClass();
    }
}
