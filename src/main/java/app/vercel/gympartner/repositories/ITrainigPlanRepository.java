package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ITrainigPlanRepository extends JpaRepository<TrainingPlan, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE TrainingPlan tp SET tp.hide = true WHERE tp.idTrainingPlan =:id")
    void hideTrainingPlan(@Param("id") Integer id);
}
