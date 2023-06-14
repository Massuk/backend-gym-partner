package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IMealRepository extends JpaRepository<Meal, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Meal m SET m.hide = false WHERE m.idMeal =:id")
    void ocultarComida(@Param("id") Integer id);
}
