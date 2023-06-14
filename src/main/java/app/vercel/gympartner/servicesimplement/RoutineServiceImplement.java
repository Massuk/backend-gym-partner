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
    public void insert(Routine routine) {
        rR.save(routine);
    }

    @Override
    public List<Routine> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idTplan) {
        rR.deleteById(idTplan);
    }

    @Override
    public void hideExercise(int id) {
        rR.hideExercise(id);
    }
}
