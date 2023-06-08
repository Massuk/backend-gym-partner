package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExerciseRepository extends JpaRepository<Exercise,Integer> {

}
