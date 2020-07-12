package com.pulak.springframework.n3didemo.controllers;

import com.pulak.springframework.n3didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


/**
 * Created by jt on 5/24/17.
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public String sayHello(String s){
        return greetingService.sayGreeting(s);
    }

}
