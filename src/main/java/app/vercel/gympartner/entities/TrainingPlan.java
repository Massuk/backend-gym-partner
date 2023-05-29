package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "trainingPlans")
public class TrainingPlan {
    // --- ORM Setup --- //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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
    @Column(name = "enable", nullable = false)
    private boolean enable;

    // --- Constructors --- //
    public TrainingPlan() {
    }
    public TrainingPlan(int id, String title, String description, String objective, String level, LocalDate startDate, LocalDate endDate, boolean enable) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.objective = objective;
        this.level = level;
        this.startDate = startDate;
        this.endDate = endDate;
        this.enable = enable;
    }

    // --- Getters and Setters ---//
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public boolean isEnable() {
        return enable;
    }
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
