package com.vegetarianmealplanner.meal_planner.controller;

import com.vegetarianmealplanner.meal_planner.model.Recipe;
import com.vegetarianmealplanner.meal_planner.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor // Lombok annotation for constructor injection
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    // Get all recipes
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        System.out.println("Fetched recipes: " + recipes);
        return recipes;
    }


    // Get a specific recipe by ID
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable Long id) {
        return recipeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

