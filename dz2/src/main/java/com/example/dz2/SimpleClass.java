package com.example.dz2;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SimpleClass {

    @Lookup
    public PrototypeClass getPrototypeClass() {
        return null;
    }

}
