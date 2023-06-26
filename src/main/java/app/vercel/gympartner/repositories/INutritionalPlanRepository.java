package app.vercel.gympartner.repositories;

import app.vercel.gympartner.dtos.NutritionalPlanDTO;
import app.vercel.gympartner.entities.NutritionalPlan;
import app.vercel.gympartner.entities.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface INutritionalPlanRepository extends JpaRepository<NutritionalPlan, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE NutritionalPlan nP SET nP.hide = true WHERE nP.idNutritionalPlan =:id")
    void hideNutritionalPlan(@Param("id") Integer id);
    @Query("from NutritionalPlan n where n.client.idUser = :idUser AND n.hide = false")
    List<NutritionalPlan> listNutritionalPlansByIdUser(@Param("idUser") int idUser);
}