package app.vercel.gympartner.dtos;

import java.time.LocalDate;

public class NutritionalPlanDTO {
    private int idNutritionalPlan;
    private String title;
    private String objective;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String recommendations;
    private String status;
    private boolean hide;


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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }



}
