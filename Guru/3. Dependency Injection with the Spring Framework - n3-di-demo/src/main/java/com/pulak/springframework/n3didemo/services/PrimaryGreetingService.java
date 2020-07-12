package com.pulak.springframework.n3didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting(String s) {
        return "Primary" + s;
    }
}
