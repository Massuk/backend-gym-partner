package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "nutritionists")
@PrimaryKeyJoinColumn(name = "idNutritionist", referencedColumnName = "idUser")
public class Nutritionist extends User{
    @Column(name = "yearHired", nullable = false)
    private LocalDate yearHired;
    @ManyToOne
    @JoinColumn(name = "idGym")
    private Gym gym;

    public Nutritionist() {
    }
    public Nutritionist(int idUser, String name, String lastname, String email, String password, String gender, LocalDate birthDate, String cellphone, boolean status, Role role, LocalDate yearHired, Gym gym) {
        super(idUser, name, lastname, email, password, gender, birthDate, cellphone, status, role);
        this.yearHired = yearHired;
        this.gym = gym;
    }

    public LocalDate getYearHired() {
        return yearHired;
    }
    public void setYearHired(LocalDate yearHired) {
        this.yearHired = yearHired;
    }
    public Gym getGym() {
        return gym;
    }
    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
