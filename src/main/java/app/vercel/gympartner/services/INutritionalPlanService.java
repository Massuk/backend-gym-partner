package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.NutritionalPlan;

import java.util.List;

public interface INutritionalPlanService {
    void  insert (NutritionalPlan nutritionalPlan);
    List<NutritionalPlan> list();
    NutritionalPlan listId(int idNutritionalPlan);
    void hideNutritionalPlan(int id);
}
