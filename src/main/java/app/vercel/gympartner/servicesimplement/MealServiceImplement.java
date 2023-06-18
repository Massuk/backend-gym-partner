package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Meal;
import app.vercel.gympartner.repositories.IMealRepository;
import app.vercel.gympartner.services.IMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImplement implements IMealService {

    @Autowired
    private IMealRepository mR;

    @Override
    public void insert(Meal meal) {
        mR.save(meal);
    }

    @Override
    public List<Meal> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idNutritionalPlan) {
        mR.deleteById(idNutritionalPlan);
    }

    @Override
    public void hideMeal(int id) {

    }
}
