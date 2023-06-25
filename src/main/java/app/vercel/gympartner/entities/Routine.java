package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "routines")
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoutine;
    @Column(name="title", length = 50, nullable = false)
    private String title;
    @Column(name="day", length = 30, nullable = false)
    private String day;
    @Column(name="description", length = 250, nullable = false)
    private String description;
    @Column(name = "hide", nullable = false)
    private boolean hide;
    @ManyToOne
    @JoinColumn(name = "id_training_plan", nullable = false)
    private TrainingPlan trainingPlan;

    public Routine() {
    }
    public Routine(int idRoutine, String title, String day, String description, boolean hide, TrainingPlan trainingPlan) {
        this.idRoutine = idRoutine;
        this.title = title;
        this.day = day;
        this.description = description;
        this.hide = hide;
        this.trainingPlan = trainingPlan;
    }

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
