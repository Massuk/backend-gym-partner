package app.vercel.gympartner.dtos;

import java.time.LocalDate;

public class NutritionalPlanDTO {
    private int idNutritionalPlan;
    private String titleNutritionalPlan;
    private String statusNutritionalPlan;
    private String objectiveNutritionalPlan;
    private String descriptionNutritionalPlan;
    private LocalDate startDateNutritionalPlan;
    private LocalDate endDateNutritionalPlan;
    private String recommendationsNutritionalPlan;

    private boolean status;

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
