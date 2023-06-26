package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.NutritionalPlan;
import app.vercel.gympartner.entities.TrainingPlan;

import java.util.List;

public interface INutritionalPlanService {
    List<NutritionalPlan> listNutritionalPlansByIdUser(int idUser);
    void  insert (NutritionalPlan nutritionalPlan);
    NutritionalPlan listId(int idNutritionalPlan);
    void hideNutritionalPlan(int id);
}