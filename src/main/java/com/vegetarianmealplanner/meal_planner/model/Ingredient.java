package com.vegetarianmealplanner.meal_planner.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data // Lombok annotation for getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation for no-args constructor
@AllArgsConstructor // Lombok annotation for all-args constructor
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
}
