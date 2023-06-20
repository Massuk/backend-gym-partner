package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.NutritionalPlan;


public class MealDTO {
    private int idMeal;
    private String title;
    private String day;
    private String type;
    private boolean hide;
    private NutritionalPlan nutritionalPlan;

    public int getIdMeal() {
        return idMeal;
    }
    public void setIdMeal(int idMeal) {
        this.idMeal = idMeal;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
    public NutritionalPlan getNutritionalPlan() {
        return nutritionalPlan;
    }
    public void setNutritionalPlan(NutritionalPlan nutritionalPlan) {
        this.nutritionalPlan = nutritionalPlan;
    }
}
