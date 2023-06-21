package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Nutritionist;
import app.vercel.gympartner.repositories.INutritionistRepository;
import app.vercel.gympartner.services.INutritionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionistServiceImplement implements INutritionistService {
    @Autowired
    private INutritionistRepository nR;

    @Override
    public void insert(Nutritionist nutritionist) {
        nR.save(nutritionist);
    }
    @Override
    public List<Nutritionist> list() {
        return nR.findAll();
    }
    @Override
    public Nutritionist listId(int id) {
        return nR.findById(id).orElse(new Nutritionist());
    }
}
