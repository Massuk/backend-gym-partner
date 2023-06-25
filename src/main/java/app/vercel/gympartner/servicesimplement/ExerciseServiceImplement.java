package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Exercise;
import app.vercel.gympartner.repositories.IExerciseRepository;
import app.vercel.gympartner.services.IExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImplement implements IExerciseService {
    @Autowired
    private IExerciseRepository eR;

    @Override
    public List<Exercise> listExercisesByIdRoutine(int idRoutine) {
        return eR.listExercisesByIdRoutine(idRoutine);
    }
    @Override
    public void insert(Exercise exercise) {
        eR.save(exercise);
    }
    @Override
    public void delete(int idExercise) {
        eR.deleteById(idExercise);
    }
    @Override
    public Exercise listId(int idExercise) {
        return eR.findById(idExercise).orElse(new Exercise());
    }
}
