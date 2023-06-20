package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Client;

import java.time.LocalDate;

public class TrainingPlanDTO {
    private int idTrainingPlan;
    private String title;
    private String description;
    private String objective;
    private String level;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean status;
    private boolean hide;
    private Client client;

    public int getIdTrainingPlan() {
        return idTrainingPlan;
    }
    public void setIdTrainingPlan(int idTrainingPlan) {
        this.idTrainingPlan = idTrainingPlan;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getObjective() {
        return objective;
    }
    public void setObjective(String objective) {
        this.objective = objective;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
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
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
}
