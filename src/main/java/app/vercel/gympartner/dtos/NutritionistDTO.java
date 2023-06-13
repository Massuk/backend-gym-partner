package app.vercel.gympartner.dtos;

public class NutritionistDTO extends UserDTO{
    private double salary;
    private int yearsWorking;

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
