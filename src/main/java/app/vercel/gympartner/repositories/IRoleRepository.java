package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Role r SET r.hide = true WHERE r.idRole =:id")
    void hideRole(@Param("id") Integer id);
}
