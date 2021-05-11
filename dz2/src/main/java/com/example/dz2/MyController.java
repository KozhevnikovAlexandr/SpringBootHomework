package com.example.dz2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private RequestData requestData;
    @Autowired
    private SingletonClass singletonData;

    @RequestMapping("/singleton")
    public String singletonData(){
        return Integer.toString(singletonData.getNumber());
    }

    @RequestMapping("/request")
    public String randomData(){
        return Integer.toString(requestData.getNumber());
    }
}
