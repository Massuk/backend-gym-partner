package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
//    @Transactional
//    @Modifying
//    @Query("UPDATE Client c SET c.hide = true WHERE c.idUser =:id")
//    void hideClient(@Param("id") Integer id);
}
