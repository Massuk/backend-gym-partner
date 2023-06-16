package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "foods")
public class Food {

    // --- ORM Setup --- //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFood;
    @Column(name = "title", length = 30, nullable = false)
    private String title;
    @Column(name = "portions", length = 10, nullable = false)
    private int portionsFood;
    @Column(name = "calories", length = 10, nullable = false)
    private int calories;
    @ManyToOne
    @JoinColumn(name = "id_meal")
    private Meal meal;

    // --- Constructors --- //
    public Food() {

    }

    public Food(int idFood, String title, int portionsFood, int calories, Meal meal) {
        this.idFood = idFood;
        this.title = title;
        this.portionsFood = portionsFood;
        this.calories = calories;
        this.meal = meal;
    }

    // --- Getters and Setters ---//

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPortionsFood() {
        return portionsFood;
    }

    public void setPortionsFood(int portionsFood) {
        this.portionsFood = portionsFood;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
