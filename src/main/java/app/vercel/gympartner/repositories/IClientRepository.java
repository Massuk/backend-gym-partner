package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
    @Query("from Client c where (c.nutritionist.email = :username OR c.trainer.email = :username) AND c.status = true")
    List<Client> listClientsByUsername(@Param("username") String username);
}
