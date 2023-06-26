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
    public List<Meal> listMealsByIdNutritionalPlan(int idNutritionalPlan) {
        return mR.listMealsByIdNutritionalPlan(idNutritionalPlan);
    }

    @Override
    public Meal listId(int idMeal) {
        return mR.findById(idMeal).orElse(new Meal());
    }

    @Override
    public void hideMeal(int idMeal) {
        mR.hideMeal(idMeal);
    }
}