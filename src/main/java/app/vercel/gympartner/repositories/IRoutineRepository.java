package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Routine;
import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IRoutineRepository extends JpaRepository<Routine,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Routine r SET r.status = false WHERE r.idRoutine =:id")
    void ocultarEjercicio(@Param("id") Integer id);
}
