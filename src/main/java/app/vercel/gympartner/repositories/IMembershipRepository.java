package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMembershipRepository extends JpaRepository<Membership,Integer> {

}
