package com.vegetarianmealplanner.meal_planner.repository;

import com.vegetarianmealplanner.meal_planner.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}

