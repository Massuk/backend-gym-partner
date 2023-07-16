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
    @Query(value =
            "SELECT CONCAT(u.name, ' ', u.lastname) AS full_name, COUNT(c.id_client) AS client_count "
                    + "FROM users u "
                    + "INNER JOIN nutritionists n ON u.id_user = n.id_nutritionist "
                    + "LEFT JOIN clients c ON n.id_nutritionist = c.id_nutritionist "
                    + "GROUP BY full_name", nativeQuery = true)
    List<String[]> getClientCountByNutritionistName();

}