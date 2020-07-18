package com.pulak.springframework.petclinic.controllers;

import com.pulak.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@RequestMapping("owners")
@Controller
public class OwnerController {
    OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("oList", ownerService.findAll().stream().
                sorted((x,y)->x.getId().compareTo(y.getId())).collect(Collectors.toList()));
        return "owners/ownerlist";
    }
}
