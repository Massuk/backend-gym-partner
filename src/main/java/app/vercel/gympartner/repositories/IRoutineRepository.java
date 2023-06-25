package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IRoutineRepository extends JpaRepository<Routine,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Routine r SET r.hide = true WHERE r.idRoutine =:id")
    void hideRoutine(@Param("id") Integer id);
    @Query("from Routine r where r.trainingPlan.idTrainingPlan = :idTrainingPlan AND r.hide = false")
    List<Routine> listRoutinesByIdTrainingPlan(@Param("idTrainingPlan") int idTrainingPlan);
}
