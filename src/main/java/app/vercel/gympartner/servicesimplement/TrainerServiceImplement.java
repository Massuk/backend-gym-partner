package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Trainer;
import app.vercel.gympartner.repositories.ITrainerRepository;
import app.vercel.gympartner.services.ITrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImplement implements ITrainerService {
    @Autowired
    private ITrainerRepository tR;

    @Override
    public void insert(Trainer trainer) {
        tR.save(trainer);
    }
    @Override
    public List<Trainer> list() {
        return tR.findAll();
    }
    @Override
    public Trainer listId(int id) {
        return tR.findById(id).orElse(new Trainer());
    }
    @Override
    public void disable(int id) {
        tR.disable(id);
    }
}
