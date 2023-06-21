package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Nutritionist;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface INutritionistService {
    void insert(Nutritionist nutritionist);
    List<Nutritionist> list();
    Nutritionist listId(int id);
    List<Nutritionist> listNutritionistsByUsername(String username);
}