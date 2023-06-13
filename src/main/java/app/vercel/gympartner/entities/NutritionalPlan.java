package app.vercel.gympartner.entities;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "nutritionalPlans")
public class NutritionalPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNutritionalPlan;
    @Column (name = "titleNutritionalPlan", length = 60, nullable = false)
    private String titleNutritionalPlan;
    @Column (name = "statusNutritionalPlan", length = 10, nullable = false)
    private String statusNutritionalPlan;
    @Column (name = "objectiveNutritionalPlan", length = 30, nullable = false)
    private String objectiveNutritionalPlan;
    @Column (name = "descriptionNutritionalPlan", length = 280, nullable = false)
    private String descriptionNutritionalPlan;
    @Column (name = "startDateNutritionalPlan", nullable = false)
    private LocalDate startDateNutritionalPlan;
    @Column (name = "endDateNutritionalPlan", nullable = false)
    private LocalDate endDateNutritionalPlan;
    @Column (name = "recommendationsNutritionalPlan", length = 280, nullable = false)
    private String recommendationsNutritionalPlan;
    @Column(name = "status", nullable = false)
    private boolean status;

    public NutritionalPlan() {
    }

    public NutritionalPlan(int idNutritionalPlan, String titleNutritionalPlan, String statusNutritionalPlan, String objectiveNutritionalPlan, String descriptionNutritionalPlan, LocalDate startDateNutritionalPlan, LocalDate endDateNutritionalPlan, String recommendationsNutritionalPlan) {
        this.idNutritionalPlan = idNutritionalPlan;
        this.titleNutritionalPlan = titleNutritionalPlan;
        this.statusNutritionalPlan = statusNutritionalPlan;
        this.objectiveNutritionalPlan = objectiveNutritionalPlan;
        this.descriptionNutritionalPlan = descriptionNutritionalPlan;
        this.startDateNutritionalPlan = startDateNutritionalPlan;
        this.endDateNutritionalPlan = endDateNutritionalPlan;
        this.recommendationsNutritionalPlan = recommendationsNutritionalPlan;
        this.status = true;
    }

    public int getIdNutritionalPlan() {
        return idNutritionalPlan;
    }

    public void setIdNutritionalPlan(int idNutritionalPlan) {
        this.idNutritionalPlan = idNutritionalPlan;
    }

    public String getTitleNutritionalPlan() {
        return titleNutritionalPlan;
    }

    public void setTitleNutritionalPlan(String titleNutritionalPlan) {
        this.titleNutritionalPlan = titleNutritionalPlan;
    }

    public String getStatusNutritionalPlan() {
        return statusNutritionalPlan;
    }

    public void setStatusNutritionalPlan(String statusNutritionalPlan) {
        this.statusNutritionalPlan = statusNutritionalPlan;
    }

    public String getObjectiveNutritionalPlan() {
        return objectiveNutritionalPlan;
    }

    public void setObjectiveNutritionalPlan(String objectiveNutritionalPlan) {
        this.objectiveNutritionalPlan = objectiveNutritionalPlan;
    }

    public String getDescriptionNutritionalPlan() {
        return descriptionNutritionalPlan;
    }

    public void setDescriptionNutritionalPlan(String descriptionNutritionalPlan) {
        this.descriptionNutritionalPlan = descriptionNutritionalPlan;
    }

    public LocalDate getStartDateNutritionalPlan() {
        return startDateNutritionalPlan;
    }

    public void setStartDateNutritionalPlan(LocalDate startDateNutritionalPlan) {
        this.startDateNutritionalPlan = startDateNutritionalPlan;
    }

    public LocalDate getEndDateNutritionalPlan() {
        return endDateNutritionalPlan;
    }

    public void setEndDateNutritionalPlan(LocalDate endDateNutritionalPlan) {
        this.endDateNutritionalPlan = endDateNutritionalPlan;
    }

    public String getRecommendationsNutritionalPlan() {
        return recommendationsNutritionalPlan;
    }

    public void setRecommendationsNutritionalPlan(String recommendationsNutritionalPlan) {
        this.recommendationsNutritionalPlan = recommendationsNutritionalPlan;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
