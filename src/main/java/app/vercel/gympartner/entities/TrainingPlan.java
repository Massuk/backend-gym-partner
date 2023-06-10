package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainingPlans")
public class TrainingPlan {
    // --- ORM Setup --- //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrainingPlan;
    @Column(name = "title", length = 30, nullable = false)
    private String title;
    @Column(name = "description", length = 150, nullable = false)
    private String description;
    @Column(name = "objective", length = 30, nullable = false)
    private String objective;
    @Column(name = "level", length = 30, nullable = false)
    private String level;
    @Column(name = "startDate", nullable = false)
    private LocalDate startDate;
    @Column(name = "endDate", nullable = false)
    private LocalDate endDate;
    @Column(name = "status", nullable = false)
    private boolean status;


    // --- Constructors --- //
    public TrainingPlan() {
    }

    public TrainingPlan(int idTrainingPlan, String title, String description, String objective, String level, LocalDate startDate, LocalDate endDate, boolean status) {
        this.idTrainingPlan = idTrainingPlan;
        this.title = title;
        this.description = description;
        this.objective = objective;
        this.level = level;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    // --- Getters and Setters ---//
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
}
