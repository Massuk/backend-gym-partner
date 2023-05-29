package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainigPlanRepository extends JpaRepository<TrainingPlan, Integer> {
}
