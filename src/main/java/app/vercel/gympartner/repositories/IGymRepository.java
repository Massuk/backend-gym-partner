package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IGymRepository extends JpaRepository<Gym, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Gym g SET g.hide = true WHERE g.idGym =:id")
    void hideGym(@Param("id") Integer id);
    @Query("from Gym g where g.owner.email = :username")
    Gym listGymByUsername(@Param("username") String username);
    @Query("select t.gym.name, count(t) from Trainer t where t.gym.idGym= :id GROUP BY t.gym.idGym, t.gym.name")
    List<String[]> getTrainersByGym(@Param("id") int id);
    @Query("select n.gym.name, count (n) from Nutritionist n where n.gym.idGym= :id GROUP BY n.gym.idGym, n.gym.name")
    List<String[]> getNutritionistsByGym(@Param("id") int id);
    @Query(value =
            "SELECT g.name, count(t.id_trainer) AS trainer_count\n \n" +
            "FROM gyms g \n" +
            "JOIN trainers t ON g.id_gym = t.id_gym \n " +
            "GROUP BY g.name\n \n", nativeQuery = true)
    List<String[]> getTrainerCountByGym();
    @Query(value =
            "SELECT g.name, COUNT(n.id_nutritionist) AS nutritionist_count\n \n" +
            "FROM gyms g \n" +
            "JOIN nutritionists n ON g.id_gym = n.id_gym \n " +
            "GROUP BY g.name\n \n", nativeQuery = true)
    List<String[]> getNutritionistCountByGym();
}
