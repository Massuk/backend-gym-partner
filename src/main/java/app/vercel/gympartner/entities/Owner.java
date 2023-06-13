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
    public Owner(int idUser, String name, String lastname, String gender, int age, LocalDate birthDate, int cellphone, String email, String dni, boolean status, Role role) {
        super(idUser, name, lastname, gender, age, birthDate, cellphone, email, dni, status, role);
    }
}
