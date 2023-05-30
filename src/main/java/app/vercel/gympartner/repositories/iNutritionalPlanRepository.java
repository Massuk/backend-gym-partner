package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.NutritionalPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iNutritionalPlanRepository extends JpaRepository<NutritionalPlan, Integer> {
}
