package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "nutritionalPlans")
public class NutritionalPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNutritionalPlan;
    @Column (name = "title", length = 50, nullable = false)
    private String title;
    @Column (name = "objective", length = 50, nullable = false)
    private String objective;
    @Column (name = "description", length = 250, nullable = false)
    private String description;
    @Column (name = "startDate", nullable = false)
    private LocalDate startDate;
    @Column (name = "endDate", nullable = false)
    private LocalDate endDate;
    @Column (name = "recommendations", length = 250, nullable = false)
    private String recommendations;
    @Column (name = "status", length = 30, nullable = false)
    private String status;
    @Column (name = "hide", nullable = false)
    private boolean hide;


    public NutritionalPlan() {
    }

    public NutritionalPlan(int idNutritionalPlan, String title, String objective, String description, LocalDate startDate, LocalDate endDate, String recommendations, String status, boolean hide) {
        this.idNutritionalPlan = idNutritionalPlan;
        this.title = title;
        this.objective = objective;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recommendations = recommendations;
        this.status = status;
        this.hide = hide;
    }

    public int getIdNutritionalPlan() {
        return idNutritionalPlan;
    }

    public void setIdNutritionalPlan(int idNutritionalPlan) {
        this.idNutritionalPlan = idNutritionalPlan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDateNutritionalPlan) {
        this.endDate = endDateNutritionalPlan;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }


}
