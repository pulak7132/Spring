package com.pulak.springframework.n3didemo.services;

import org.springframework.stereotype.Service;

@Service
public class NewGreetingService implements GreetingService {
    @Override
    public String sayGreeting(String s) {
        return "NewService " + s;
    }
}
