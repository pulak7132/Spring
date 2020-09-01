package com.example.recipe.controllers;

import com.example.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@RequestMapping("/")
@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "index"})
    public String getIndexPage(Model model){
        log.debug("Getting Index Page here");
//        System.out.println("Howdy!!aaa");
//        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//        System.out.println("Category Id is " + categoryOptional.get().getId());
//        System.out.println("UnitOfMeasure is " + unitOfMeasureOptional.get().getId());
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
