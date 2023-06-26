package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Food;

import java.util.List;

public interface IFoodService {
    List<Food>listFoodsByIdMeal(int idMeal);
    public void insert(Food food);
    public void delete(int idFood);
    public Food listId(int idFood);
}
