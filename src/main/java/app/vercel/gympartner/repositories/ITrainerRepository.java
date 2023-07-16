package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Nutritionist;
import app.vercel.gympartner.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer, Integer> {
    @Query("from Trainer t where t.gym.owner.email=:username")
    List<Trainer> listTrainersByUsername(@Param("username") String username);
    @Query(value =
            "SELECT CONCAT(u.name, ' ', u.lastname) AS full_name, COUNT(c.id_client) AS client_count "
                    + "FROM users u "
                    + "INNER JOIN trainers t ON u.id_user = t.id_trainer "
                    + "LEFT JOIN clients c ON t.id_trainer = c.id_trainer "
                    + "GROUP BY full_name", nativeQuery = true)
    List<String[]> getClientCountByTrainerName();
}
