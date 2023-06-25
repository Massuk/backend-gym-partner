package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.TrainingPlan;

public class RoutineDTO {
    private int idRoutine;
    private String title;
    private String day;
    private String description;
    private boolean hide;
    private TrainingPlan trainingPlan;

    public int getIdRoutine() {
        return idRoutine;
    }
    public void setIdRoutine(int idRoutine) {
        this.idRoutine = idRoutine;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }
    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }
}
