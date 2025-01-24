package com.vegetarianmealplanner.meal_planner.controller;

import com.vegetarianmealplanner.meal_planner.model.Ingredient;
import com.vegetarianmealplanner.meal_planner.repository.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor // Lombok annotation for constructor injection
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

    // Get all ingredients
    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }
}

