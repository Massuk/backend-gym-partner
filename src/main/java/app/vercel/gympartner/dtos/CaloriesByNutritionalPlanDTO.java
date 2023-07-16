package app.vercel.gympartner.dtos;

public class CaloriesByNutritionalPlanDTO {
    private String title;
    private double count;

    public CaloriesByNutritionalPlanDTO() {
    }
    public CaloriesByNutritionalPlanDTO(String title, double count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getCount() {
        return count;
    }
    public void setCount(double count) {
        this.count = count;
    }
}