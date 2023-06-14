package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.NutritionalPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface INutritionalPlanRepository extends JpaRepository<NutritionalPlan, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE NutritionalPlan np SET np.hide = true WHERE np.idNutritionalPlan =:id")
    void hideNPlan(@Param("id") Integer id);
}
