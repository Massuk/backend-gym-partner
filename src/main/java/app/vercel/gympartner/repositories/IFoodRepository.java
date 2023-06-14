package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IFoodRepository extends JpaRepository<Food, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Food f SET f.status = false WHERE f.idFood =:id")
    void ocultarAlimento(@Param("id") Integer id);
}
