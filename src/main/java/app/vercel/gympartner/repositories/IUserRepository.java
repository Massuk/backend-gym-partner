package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT COUNT(u.email) FROM User u WHERE u.email =:email")
    public int validateEmail(@Param("email") String email);
    public User findByEmail(String email);
}