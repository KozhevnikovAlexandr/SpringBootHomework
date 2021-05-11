package com.example.dz2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Dz2ApplicationTests {

    ApplicationContext context =
            new AnnotationConfigApplicationContext(Dz2Application.class);
    String text = "Abc";

    @Test
    void singletonTest() {
        SingletonClass a = context.getBean(SingletonClass.class);
        SingletonClass b = context.getBean(SingletonClass.class);
        a.setText(text);
        assertEquals(text, b.getText());
    }

    @Test
    void prototypeTest() {
        PrototypeClass a = context.getBean(PrototypeClass.class);
        PrototypeClass b = context.getBean(PrototypeClass.class);
        a.setText(text);
        assertNotEquals(text, b.getText());
    }

    @Test
    void lookUpTest() {
        SimpleClass first = context.getBean(SimpleClass.class);
        SimpleClass second = context.getBean(SimpleClass.class);

        assertEquals(first, second);
        assertNotEquals(first.getPrototypeClass(), second.getPrototypeClass());
    }

}
