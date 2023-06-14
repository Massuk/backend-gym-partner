package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Meal;

import java.util.List;

public interface IMealService {
    public void insert(Meal meal);
    List<Meal> list();
    public void delete(int idNutritionalPlan);
    void ocultarComida(int id);
}
