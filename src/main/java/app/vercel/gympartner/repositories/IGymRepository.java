package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IGymRepository extends JpaRepository<Gym, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Gym g SET g.hide = true WHERE g.idGym =:id")
    void hideGym(@Param("id") Integer id);
}
