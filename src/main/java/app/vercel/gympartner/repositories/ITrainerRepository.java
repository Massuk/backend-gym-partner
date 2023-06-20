package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer, Integer> {
//    @Transactional
//    @Modifying
//    @Query("UPDATE Trainer t SET t.hide = true WHERE t.idUser =:id")
//    void hideTrainer(@Param("id") Integer id);
}
