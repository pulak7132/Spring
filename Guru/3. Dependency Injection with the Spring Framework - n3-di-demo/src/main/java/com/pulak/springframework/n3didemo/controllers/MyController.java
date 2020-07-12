package com.pulak.springframework.n3didemo.controllers;

import com.pulak.springframework.n3didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    GreetingService myGreetingService;

    public MyController(GreetingService myGreetingService) {
        this.myGreetingService = myGreetingService;
    }

    public String hello(){
        return myGreetingService.sayGreeting(" : test for P");
    }

}

