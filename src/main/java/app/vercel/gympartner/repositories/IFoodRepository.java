package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepository extends JpaRepository<Food, Integer> {
}
