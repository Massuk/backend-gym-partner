package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IExerciseRepository extends JpaRepository<Exercise,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Exercise e SET e.hide = true WHERE e.idExercise =:id")
    void hideExercise(@Param("id") Integer id);
}
