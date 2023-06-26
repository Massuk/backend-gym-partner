package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Meal;
import app.vercel.gympartner.entities.Routine;

import java.util.List;

public interface IMealService {
    public void insert(Meal meal);
    List<Meal> listMealsByIdNutritionalPlan(int idNutritionalPlan);
    Meal listId(int idMeal);
    void hideMeal(int idMeal);
}