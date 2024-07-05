package com.spring6;

import com.spring6.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AppTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutowireOfController() {
        assertEquals("Hello World",myController.sayHello());
    }

    @Test
    void testGetControllerFromCtx() {
        MyController bean = applicationContext.getBean(MyController.class);
        assertEquals("Hello World",myController.sayHello());
    }

}
