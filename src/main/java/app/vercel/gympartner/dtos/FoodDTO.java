package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Meal;

import javax.persistence.Column;

public class FoodDTO {
    private int idFood;
    private String name;
    private int portions;
    private int calories;
    private Meal meal;


    // --- Getters and Setters ---//


    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
