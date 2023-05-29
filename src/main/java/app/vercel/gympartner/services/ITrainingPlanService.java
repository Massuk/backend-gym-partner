package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.TrainingPlan;

import java.util.List;

public interface ITrainingPlanService {
    public void insert(TrainingPlan tPlan);
    List<TrainingPlan> list();
    public void delete(int idTplan);
    public TrainingPlan listId(int idTplan);
}
