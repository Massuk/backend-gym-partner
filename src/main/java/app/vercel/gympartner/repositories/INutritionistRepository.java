package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Nutritionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INutritionistRepository extends JpaRepository<Nutritionist, Integer> {
    @Query("from Nutritionist n where n.gym.owner.email = :username")
    List<Nutritionist> listNutritionistsByUsername(@Param("username") String username);
}