package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Nutritionist;

import java.util.List;

public interface INutritionistService {
    void insert(Nutritionist nutritionist);
    List<Nutritionist> list();
    Nutritionist listId(int id);
    void hideNutritionist(int id);
}