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
    @Column(name="day", length = 20, nullable = false)
    private String day;
    @Column(name="hour", nullable = false)
    private Time hour;
    @Column(name = "status", nullable = false)
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "id_nutritionalPlan")
    private NutritionalPlan nutritionalPlan;

    public Meal(int idMeal, String title, String day, Time hour, boolean status, NutritionalPlan nutritionalPlan) {
        this.idMeal = idMeal;
        this.title = title;
        this.day = day;
        this.hour = hour;
        this.status = status;
        this.nutritionalPlan = nutritionalPlan;
    }

    public Meal() {

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

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public NutritionalPlan getNutritionalPlan() {
        return nutritionalPlan;
    }

    public void setNutritionalPlan(NutritionalPlan nutritionalPlan) {
        this.nutritionalPlan = nutritionalPlan;
    }
}
