package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFood;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "portions", length = 50, nullable = false)
    private int portions;
    @Column(name = "calories", length = 10, nullable = false)
    private double calories;
    @ManyToOne
    @JoinColumn(name = "id_meal", nullable = false)
    private Meal meal;

    // --- Constructors --- //
    public Food() {
    }
    public Food(int idFood, String name, int portions, double calories, Meal meal) {
        this.idFood = idFood;
        this.name = name;
        this.portions = portions;
        this.calories = calories;
        this.meal = meal;
    }

    public int getIdFood() {
        return idFood;
    }
    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPortions() {
        return portions;
    }
    public void setPortions(int portions) {
        this.portions = portions;
    }
    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    public Meal getMeal() {
        return meal;
    }
    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
