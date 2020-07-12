package com.pulak.springframework.n3didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("fr")
@Primary
public class PrimaryFrenchGreetingService implements GreetingService {
    @Override
    public String sayGreeting(String s) {
        return "Bonjour et bienvenue";
    }
}
