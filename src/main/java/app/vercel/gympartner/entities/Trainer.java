package app.vercel.gympartner.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "trainers")
@PrimaryKeyJoinColumn(name = "idTrainer", referencedColumnName = "idUser")
public class Trainer extends User{
    @Column(name = "salary", nullable = false)
    private double salary;
    @Column(name = "yearsWorking", nullable = false)
    private int yearsWorking;

    public Trainer() {
    }
    public Trainer(int idUser, String name, String lastname, String gender, int age, LocalDate birthDate, int cellphone, String email, String dni, boolean status, Role role, double salary, int yearsWorking) {
        super(idUser, name, lastname, gender, age, birthDate, cellphone, email, dni, status, role);
        this.salary = salary;
        this.yearsWorking = yearsWorking;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getYearsWorking() {
        return yearsWorking;
    }
    public void setYearsWorking(int yearsWorking) {
        this.yearsWorking = yearsWorking;
    }
}
