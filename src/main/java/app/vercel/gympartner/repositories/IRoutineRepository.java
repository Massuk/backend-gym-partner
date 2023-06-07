package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Routine;
import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoutineRepository extends JpaRepository<Routine,Integer> {
}
