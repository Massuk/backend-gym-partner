package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Routine;
import app.vercel.gympartner.entities.TrainingPlan;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRoutineService {
    List<Routine> listRoutinesByIdTrainingPlan(int idTrainingPlan);
    public void insert(Routine routine);
    Routine listId(int idRoutine);
    void hideExercise(int idRoutine);

}
