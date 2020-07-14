package com.example.jokesapp.controllers;

import com.example.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class JokeController {
    JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @GetMapping({"/", ""})
    String getJoke(Model model){
        model.addAttribute("jokesApart", jokeService.getJoke());
        return "chuck";
    }
}
