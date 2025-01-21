package com.vegetarianmealplanner.meal_planner.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data // Lombok annotation for getters, setters, toString, equals, and h
@Table(name = "ingredients") // Specifies the table name in the database
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generated primary key
    private Long id;

    private String name;

    private double amount;

    private String unit;

    private String foodCategory;

    private boolean foundAtHome;

    @Transient // Excluded from database persistence (derived value)
    private double originalAmount;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false) // Foreign key for Recipe
    private Recipe recipe;

    // Explicit getter for 'id'
    public Long getId() {
        return id;
    }

    // Explicit getter for 'name'
    public String getName() {
        return name;
    }

    // Explicit getter for 'amount'
    public double getAmount() {
        return amount;
    }

    // Explicit getter for 'unit'
    public String getUnit() {
        return unit;
    }

    // Explicit getter for 'foodCategory'
    public String getFoodCategory() {
        return foodCategory;
    }

    // Explicit getter for 'foundAtHome'
    public boolean isFoundAtHome() {
        return foundAtHome;
    }

    // Explicit getter for 'originalAmount'
    public double getOriginalAmount() {
        return originalAmount;
    }

    // Explicit getter for 'recipe'
    public Recipe getRecipe() {
        return recipe;
    }
}
