package app.vercel.gympartner.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "owners")
@PrimaryKeyJoinColumn(name = "idOwner", referencedColumnName = "idUser")
public class Owner extends User{
    public Owner() {
    }
    public Owner(int idUser, String name, String lastname, String email, String password, String gender, LocalDate birthDate, String cellphone, boolean status, Role role) {
        super(idUser, name, lastname, email, password, gender, birthDate, cellphone, status, role);
    }
}
