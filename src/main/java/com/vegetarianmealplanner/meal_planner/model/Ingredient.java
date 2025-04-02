package com.vegetarianmealplanner.meal_planner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double amount;

    private String unit;

    private String foodCategory;

    private boolean foundAtHome;

    @Transient
    private double originalAmount;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    @JsonIgnore
    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public boolean isFoundAtHome() {
        return foundAtHome;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
