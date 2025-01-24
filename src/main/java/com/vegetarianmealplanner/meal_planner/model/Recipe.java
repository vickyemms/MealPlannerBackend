package com.vegetarianmealplanner.meal_planner.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Data // Lombok annotation for getters, setters, toString, equals, and h
@Table(name = "recipes") // Specifies the table name in the database
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generated primary key
    private Long id;

    private String name;

    @Column(name = "image_resource_id")
    private String imageResourceId;

    private String cuisine;

    private String protein;

    private String healthiness;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // Relationship with ingredients
    @JoinColumn(name = "recipe_id") // Foreign key column in the Ingredient table
    //@JsonManagedReference
    private List<Ingredient> ingredients;

    @Lob // To handle large text, like instructions
    private String instructions;

    // Explicit getter for 'id'
    public Long getId() {
        return id;
    }

    // Explicit getter for 'name'
    public String getName() {
        return name;
    }

    // Explicit getter for 'imageResourceId'
    public String getImageResourceId() {
        return imageResourceId;
    }

    // Explicit getter for 'cuisine'
    public String getCuisine() {
        return cuisine;
    }

    // Explicit getter for 'protein'
    public String getProtein() {
        return protein;
    }

    // Explicit getter for 'healthiness'
    public String getHealthiness() {
        return healthiness;
    }

    // Explicit getter for 'ingredients'
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    // Explicit getter for 'instructions'
    public String getInstructions() {
        return instructions;
    }
}
