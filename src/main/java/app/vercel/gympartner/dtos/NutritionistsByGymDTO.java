package app.vercel.gympartner.dtos;

public class NutritionistsByGymDTO {
    private String name;
    private int nutritionistCount;

    public NutritionistsByGymDTO() {
    }

    public NutritionistsByGymDTO(String name, int nutritionistCount) {
        this.name = name;
        this.nutritionistCount = nutritionistCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNutritionistCount() {
        return nutritionistCount;
    }

    public void setNutritionistCount(int nutritionistCount) {
        this.nutritionistCount = nutritionistCount;
    }
}
