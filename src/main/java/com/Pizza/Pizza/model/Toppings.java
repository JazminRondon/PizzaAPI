package com.Pizza.Pizza.model;


import javax.persistence.*;

@Entity
public class Toppings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TOPPING_ID")
    private Long id;

    @Column(name= "ingredients")
    private String ingredients;

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "id=" + id +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
