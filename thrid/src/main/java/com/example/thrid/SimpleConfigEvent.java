package com.example.thrid;

public class SimpleConfigEvent {

    private final SimpleConfig simpleConfig;

    public SimpleConfig getSimpleConfig() {
        return simpleConfig;
    }

    public SimpleConfigEvent(SimpleConfig simpleConfig) {
        this.simpleConfig = simpleConfig;
    }
}
