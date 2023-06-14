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
    public void insert(Exercise exercise) {eR.save(exercise);}

    @Override
    public List<Exercise> list() {return eR.findAll();}

    @Override
    public void delete(int idExercise) {eR.deleteById(idExercise);}

    @Override
    public Exercise listid(int idExercise) {return eR.findById(idExercise).orElse(new Exercise());}

    @Override
    public void hideExercise(int id) {
        eR.ocultarEjercicio(id);
    }
}
