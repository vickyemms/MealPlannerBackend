package com.vegetarianmealplanner.meal_planner.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Data // Lombok annotation for getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation for a no-args constructor
@AllArgsConstructor // Lombok annotation for an all-args constructor
@Table(name = "recipes") // Specifies the table name in the database
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generated primary key
    private Long id;

    private String name;

    private String imageResourceId;

    private String cuisine;

    private String protein;

    private String healthiness;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // Relationship with ingredients
    @JoinColumn(name = "recipe_id") // Foreign key column in the Ingredient table
    private List<Ingredient> ingredients;

    @Lob // To handle large text, like instructions
    private String instructions;
}
