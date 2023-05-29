package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.repositories.IGymRepository;
import app.vercel.gympartner.services.IGymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymServiceImplement implements IGymService {

    @Autowired
    private IGymRepository gR;
    @Override
    public void create(Gym gym) {
        gR.save(gym);
    }
    @Override
    public List<Gym> list() {
        return gR.findAll();
    }

    @Override
    public void delete(int idGym) {
        gR.deleteById(idGym);
    }

    @Override
    public Gym listId(int idGym) {
        return gR.findById(idGym).orElse(new Gym());
    }
}
