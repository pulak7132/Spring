package com.pulak.springframework.petclinic.controllers;

import com.pulak.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@RequestMapping("vets")
@Controller
public class VetController {
    VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/index", "/index.hmtl"})
    public String listVets(Model model){
        model.addAttribute("vList", vetService.findAll().stream().
                sorted((x,y)->x.getId().compareTo(y.getId())).collect(Collectors.toList()));
        return "vets/vetlist";
    }
}
