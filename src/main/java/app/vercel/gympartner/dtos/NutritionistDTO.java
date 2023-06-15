package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Gym;

import java.time.LocalDate;

public class NutritionistDTO extends UserDTO{
    private double salary;
    private LocalDate yearHired;
    private Gym gym;

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
