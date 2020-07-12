package com.pulak.springframework.n3didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_GURUS = "Hello Gurus!!!";

    public String sayGreeting(String s) {
        return HELLO_GURUS + s;
    }
}
