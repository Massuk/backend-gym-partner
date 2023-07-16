package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, Integer> {
    @Query(value = "SELECT CONCAT(u.name, ' ', u.lastname) AS owner_fullname, g.name AS gym_name "
            + "FROM owners o "
            + "JOIN users u ON u.id_user = o.id_owner "
            + "JOIN gyms g ON g.id_owner = o.id_owner", nativeQuery = true)
    List<String[]> getOwnerGymNames();
}