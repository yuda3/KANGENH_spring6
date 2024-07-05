package com.spring6.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        return "Hello World";
    }

}
