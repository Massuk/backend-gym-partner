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
    @Column(name = "titleFood", length = 30, nullable = false)
    private String titleFood;
    @Column(name = "portionsFood", length = 10, nullable = false)
    private int portionsFood;
    @Column(name = "caloriesFood", length = 10, nullable = false)
    private int caloriesFood;
    @Column(name = "proteinsFood", length = 10, nullable = false)
    private int proteinsFood;
    @ManyToOne
    @JoinColumn(name = "id_meal")
    private Meal meal;

    // --- Constructors --- //
    public Food() {

    }

    public Food(int idFood, String titleFood, int portionsFood, int caloriesFood, int proteinsFood, Meal meal) {
        this.idFood = idFood;
        this.titleFood = titleFood;
        this.portionsFood = portionsFood;
        this.caloriesFood = caloriesFood;
        this.proteinsFood = proteinsFood;
        this.meal = meal;
    }

    // --- Getters and Setters ---//
    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {this.idFood = idFood;
    }

    public String getTitleFood() {
        return titleFood;
    }

    public void setTitleFood(String titleFood) {
        this.titleFood = titleFood;
    }

    public int getPortionsFood() {
        return portionsFood;
    }

    public void setPortionsFood(int portionsFood) {
        this.portionsFood = portionsFood;
    }

    public int getCaloriesFood() {
        return caloriesFood;
    }

    public void setCaloriesFood(int caloriesFood) {
        this.caloriesFood = caloriesFood;
    }

    public int getProteinsFood() {
        return proteinsFood;
    }

    public void setProteinsFood(int proteinsFood) {
        this.proteinsFood = proteinsFood;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
