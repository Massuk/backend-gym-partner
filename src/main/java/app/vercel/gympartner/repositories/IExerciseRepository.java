package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IExerciseRepository extends JpaRepository<Exercise,Integer> {
    @Query("from Exercise e where e.routine.idRoutine = :idRoutine")
    List<Exercise> listExercisesByIdRoutine(@Param("idRoutine") int idRoutine);
}
