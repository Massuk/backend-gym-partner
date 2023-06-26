package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFoodRepository extends JpaRepository<Food, Integer> {
    @Query("from Food f where f.meal.idMeal = :idMeal")
    List<Food> listFoodsByIdMeal(@Param("idMeal") int idMeal);
}
