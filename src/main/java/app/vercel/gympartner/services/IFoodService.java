package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Food;

import java.util.List;

public interface IFoodService {
    public void create(Food food);

    List<Food> list();

    public void delete(int idFood);

    public Food listId(int idFood);
}
