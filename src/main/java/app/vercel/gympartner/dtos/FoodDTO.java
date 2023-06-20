package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Meal;


public class FoodDTO {
    private int idFood;
    private String name;
    private int portions;
    private double calories;
    private Meal meal;

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
    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    public Meal getMeal() {
        return meal;
    }
    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
