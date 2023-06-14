package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Routine;
import app.vercel.gympartner.entities.TrainingPlan;
import app.vercel.gympartner.repositories.IRoutineRepository;
import app.vercel.gympartner.repositories.ITrainigPlanRepository;
import app.vercel.gympartner.services.ITrainingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainigPlanServiceImplement implements ITrainingPlanService {
    // --- Inyeccion de la dependecia Repository
    @Autowired
    private ITrainigPlanRepository tpR;

    // --- Sobreescritura de metodos de la clase abstracta (Interface)
    @Override
    public void insert(TrainingPlan tPlan) {
        tpR.save(tPlan);
    }

    @Override
    public List<TrainingPlan> list() {
        return tpR.findAll();
    }

    @Override
    public void delete(int idTplan) {
        tpR.deleteById(idTplan);
    }

    @Override
    public TrainingPlan listId(int idTplan) {
        return tpR.findById(idTplan).orElse(new TrainingPlan());
    }

    @Override
    public void hideTrainingPlan(int id) {
        tpR.hideTrainingPlan(id);
    }
}
