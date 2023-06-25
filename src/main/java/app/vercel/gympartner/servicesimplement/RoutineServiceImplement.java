package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Routine;
import app.vercel.gympartner.repositories.IRoutineRepository;
import app.vercel.gympartner.services.IRoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoutineServiceImplement implements IRoutineService {
    @Autowired
    private IRoutineRepository rR;

    @Override
    public List<Routine> listRoutinesByIdTrainingPlan(int idTrainingPlan) {
        return rR.listRoutinesByIdTrainingPlan(idTrainingPlan);
    }
    @Override
    public void insert(Routine routine) {
        rR.save(routine);
    }
    @Override
    public Routine listId(int idRoutine) {
        return rR.findById(idRoutine).orElse(new Routine());
    }
    @Override
    public void hideExercise(int idRoutine) {
        rR.hideRoutine(idRoutine);
    }
}
