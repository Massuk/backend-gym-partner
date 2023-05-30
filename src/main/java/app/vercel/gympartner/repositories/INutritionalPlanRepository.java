package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.NutritionalPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface INutritionalPlanRepository extends JpaRepository<NutritionalPlan, Integer> {
}
