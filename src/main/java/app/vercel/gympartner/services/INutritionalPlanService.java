package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.NutritionalPlan;

import java.util.List;

public interface INutritionalPlanService {
    public void  insert (NutritionalPlan nutritionalPlan);
    List<NutritionalPlan> list();
    public void delete(int idNutritionalPlan);
    public NutritionalPlan listId(int idNutritionalPlan);
    void hide(int id);

}
