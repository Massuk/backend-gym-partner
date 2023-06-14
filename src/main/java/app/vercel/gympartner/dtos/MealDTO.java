package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.NutritionalPlan;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Time;

public class MealDTO {
    private int idMeal;
    private String title;
    private String day;
    private Time hour;
    private boolean status;
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

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public NutritionalPlan getNutritionalPlan() {
        return nutritionalPlan;
    }

    public void setNutritionalPlan(NutritionalPlan nutritionalPlan) {
        this.nutritionalPlan = nutritionalPlan;
    }
}
