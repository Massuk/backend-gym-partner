package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.TrainingPlan;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITrainingPlanService {
    List<TrainingPlan> listTrainingPlansByIdUser(int idUser);
    void insert(TrainingPlan tPlan);
    TrainingPlan listId(int idTplan);
    void hideTrainingPlan(int idTplan);
}
