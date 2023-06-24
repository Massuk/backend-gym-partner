package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.IGymRepository;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.IGymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymServiceImplement implements IGymService {

    @Autowired
    private IGymRepository gR;
    @Autowired
    private IUserRepository uR;
    @Override
    public void insert(Gym gym) {
        gR.save(gym);
    }
    @Override
    public List<Gym> list() {
        return gR.findAll();
    }
    @Override
    public Gym listId(int idGym) {
        return gR.findById(idGym).orElse(new Gym());
    }
    @Override
    public void hideGym(int id) {
        gR.hideGym(id);
    }
    @Override
    public Gym listGymByUsername(String username) {
        return gR.listGymByUsername(username);
    }

}
