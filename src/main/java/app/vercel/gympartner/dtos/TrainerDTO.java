package app.vercel.gympartner.dtos;

import java.time.LocalDate;

public class TrainerDTO extends UserDTO{
    private double salary;
    private LocalDate yearHired;

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
