package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "trainers")
@PrimaryKeyJoinColumn(name = "idTrainer", referencedColumnName = "idUser")
public class Trainer extends User{
    @Column(name = "salary", nullable = false)
    private double salary;
    @Column(name = "yearHired", nullable = false)
    private LocalDate yearHired;
    @ManyToOne
    @JoinColumn(name = "idGym")
    private Gym gym;

    public Trainer() {
    }
    public Trainer(double salary, LocalDate yearHired, Gym gym) {
        this.salary = salary;
        this.yearHired = yearHired;
        this.gym = gym;
    }
    public Trainer(int idUser, String name, String lastname, String gender, int age, LocalDate birthDate, int cellphone, String email, String dni, boolean hide, String status, String password, Role role, double salary, LocalDate yearHired, Gym gym) {
        super(idUser, name, lastname, gender, age, birthDate, cellphone, email, dni, hide, status, password, role);
        this.salary = salary;
        this.yearHired = yearHired;
        this.gym = gym;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
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
