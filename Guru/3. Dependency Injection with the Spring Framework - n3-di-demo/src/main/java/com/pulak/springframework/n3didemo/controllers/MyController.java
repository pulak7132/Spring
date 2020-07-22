package com.pulak.springframework.n3didemo.controllers;

import com.pulak.springframework.n3didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    Environment env;
    @Value("${com.username}")
    private String userName;
    @Value("${com.password}")
    private String password;
    @Value("${com.dburl}")
    private String dbUrl;
    @Value("${jms.username}")
    private String jmsUser;
    @Value("${jms.password}")
    private String jmsPassword;
    GreetingService myGreetingService;

    public MyController(GreetingService myGreetingService) {
        this.myGreetingService = myGreetingService;
    }

    public String hello(){
        System.out.println("MyController printing properties before returning...");
        System.out.println("Props: " + userName + ", " + password + ", " + dbUrl );
        System.out.println(env.getProperty("JAVA_HOME"));
        System.out.println(env.getProperty("HADOOP_HOME"));
        System.out.println("JMS props: " + jmsUser + ", " + jmsPassword);
        return myGreetingService.sayGreeting(" : test for P");
    }

}

