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
    public Client(int idUser, String name, String lastName, String email, String password, String gender, LocalDate birthDate, String cellphone, Role role, Nutritionist nutritionist, Trainer trainer) {
        super(idUser, name, lastName, email, password, gender, birthDate, cellphone, role);
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
