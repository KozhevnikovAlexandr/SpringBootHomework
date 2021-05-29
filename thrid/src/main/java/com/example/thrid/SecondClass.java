package com.example.thrid;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.second-config")
public class SecondClass {
    private String subconfig;
    private String user;
    private String ttl;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getSubconfig() {
        return subconfig;
    }

    public void setSubconfig(String subconfig) {
        this.subconfig = subconfig;
    }
}
