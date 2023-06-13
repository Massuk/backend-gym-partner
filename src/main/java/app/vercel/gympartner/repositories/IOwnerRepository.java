package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Owner o SET o.status = false WHERE o.idUser =:id")
    void disable(@Param("id") Integer id);
}