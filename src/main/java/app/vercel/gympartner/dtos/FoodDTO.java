package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Meal;

import javax.persistence.Column;

public class FoodDTO {
    private int idFood;
    private String titleFood;
    private int portionsFood;
    private int caloriesFood;
    private int proteinsFood;
    private Meal meal;


    // --- Getters and Setters ---//

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }

    public String getTitleFood() { return titleFood;
    }

    public void setTitleFood(String titleFood) {
        this.titleFood = titleFood;
    }

    public int getPortionsFood() { return portionsFood;
    }

    public void setPortionsFood(int portionsFood) {
        this.portionsFood = portionsFood;
    }

    public int getCaloriesFood() {
        return caloriesFood;
    }

    public void setCaloriesFood(int caloriesFood) {
        this.caloriesFood = caloriesFood;
    }

    public int getProteinsFood() {
        return proteinsFood;
    }

    public void setProteinsFood(int proteinsFood) {
        this.proteinsFood = proteinsFood;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
