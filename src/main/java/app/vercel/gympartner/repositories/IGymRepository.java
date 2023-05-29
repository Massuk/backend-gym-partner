package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGymRepository extends JpaRepository<Gym, Integer> {
}
