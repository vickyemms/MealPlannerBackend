package com.vegetarianmealplanner.meal_planner.repository;

import com.vegetarianmealplanner.meal_planner.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}

