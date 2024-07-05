package com.spring6;

import com.spring6.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        MyController bean = ctx.getBean(MyController.class);
        System.out.println("In Main Method");

        System.out.println(bean.sayHello());
    }

}
