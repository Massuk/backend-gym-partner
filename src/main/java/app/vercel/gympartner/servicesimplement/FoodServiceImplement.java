package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Food;
import app.vercel.gympartner.repositories.IFoodRepository;
import app.vercel.gympartner.services.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImplement implements IFoodService {
    @Autowired
    private IFoodRepository fR;

    @Override
    public List<Food> listFoodsByIdMeal(int idMeal) {
        return fR.listFoodsByIdMeal(idMeal);
    }
    @Override
    public void insert(Food food) {
        fR.save(food);
    }
    @Override
    public void delete(int idFood) {
        fR.deleteById(idFood);
    }
    @Override
    public Food listId(int idFood) {
        return fR.findById(idFood).orElse(new Food());
    }
}
