package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
@PrimaryKeyJoinColumn(name = "idClient", referencedColumnName = "idUser")
public class Client extends User{
    @ManyToOne
    @JoinColumn(name = "idNutritionist")
    private Nutritionist nutritionist;
    @ManyToOne
    @JoinColumn(name = "idTrainer")
    private Trainer trainer;
    public Client() {
    }
    public Client(int idUser, String name, String lastname, String gender, int age, LocalDate birthDate, int cellphone, String email, String dni, boolean hide, String password, Role role, boolean status, Nutritionist nutritionist, Trainer trainer) {
        super(idUser, name, lastname, gender, age, birthDate, cellphone, email, dni, hide, password, role, status);
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
