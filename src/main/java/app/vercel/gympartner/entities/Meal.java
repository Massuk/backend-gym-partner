package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMeal;
    @Column(name = "title", length = 50, nullable = false)
    private String title;
    @Column(name="day", length = 10, nullable = false)
    private String day;
    @Column(name="type", length = 30, nullable = false)
    private String type;
    @Column(name = "hide", nullable = false)
    private boolean hide;
    @ManyToOne
    @JoinColumn(name = "id_nutritional_plan", nullable = false)
    private NutritionalPlan nutritionalPlan;

    public Meal() {
    }
    public Meal(int idMeal, String title, String day, String type, boolean hide, NutritionalPlan nutritionalPlan) {
        this.idMeal = idMeal;
        this.title = title;
        this.day = day;
        this.type = type;
        this.hide = hide;
        this.nutritionalPlan = nutritionalPlan;
    }

    public int getIdMeal() {
        return idMeal;
    }
    public void setIdMeal(int idMeal) {
        this.idMeal = idMeal;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
    public NutritionalPlan getNutritionalPlan() {
        return nutritionalPlan;
    }
    public void setNutritionalPlan(NutritionalPlan nutritionalPlan) {
        this.nutritionalPlan = nutritionalPlan;
    }
}
