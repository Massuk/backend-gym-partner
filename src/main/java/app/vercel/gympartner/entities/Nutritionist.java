package app.vercel.gympartner.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "nutritionists")
@PrimaryKeyJoinColumn(name = "idNutritionist", referencedColumnName = "idUser")
public class Nutritionist extends User{
    @Column(name = "salary", nullable = false)
    private double salary;
    @Column(name = "yearHired", nullable = false)
    private LocalDate yearHired;

    public Nutritionist() {
    }
    public Nutritionist(int idUser, String name, String lastname, String gender, int age, LocalDate birthDate, int cellphone, String email, String dni, boolean hide, String password, Role role, double salary, LocalDate yearHired) {
        super(idUser, name, lastname, gender, age, birthDate, cellphone, email, dni, hide, password, role);
        this.salary = salary;
        this.yearHired = yearHired;
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
}
