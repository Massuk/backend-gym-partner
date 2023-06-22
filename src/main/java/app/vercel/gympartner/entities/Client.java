package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
@PrimaryKeyJoinColumn(name = "idClient", referencedColumnName = "idUser")
public class Client extends User{
    @ManyToOne
    @JoinColumn(name = "idNutritionist", nullable = false)
    private Nutritionist nutritionist;
    @ManyToOne
    @JoinColumn(name = "idTrainer", nullable = false)
    private Trainer trainer;

    public Client() {
    }
    public Client(int idUser, String name, String lastname, String email, String password, String gender, LocalDate birthDate, String cellphone, boolean status, Role role, Nutritionist nutritionist, Trainer trainer) {
        super(idUser, name, lastname, email, password, gender, birthDate, cellphone, status, role);
        this.nutritionist = nutritionist;
        this.trainer = trainer;
    }

    public Nutritionist getNutritionist() {
        return nutritionist;
    }
    public void setNutritionist(Nutritionist nutritionist) {
        this.nutritionist = nutritionist;
    }
    public Trainer getTrainer() {
        return trainer;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
