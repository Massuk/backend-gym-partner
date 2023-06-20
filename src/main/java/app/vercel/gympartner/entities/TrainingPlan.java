package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainingPlans")
public class TrainingPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrainingPlan;
    @Column(name = "title", length = 50, nullable = false)
    private String title;
    @Column(name = "description", length = 250, nullable = false)
    private String description;
    @Column(name = "objective", length = 50, nullable = false)
    private String objective;
    @Column(name = "level", length = 50, nullable = false)
    private String level;
    @Column(name = "startDate", nullable = false)
    private LocalDate startDate;
    @Column(name = "endDate", nullable = false)
    private LocalDate endDate;
    @Column(name = "status", nullable = false)
    private boolean status;
    @Column(name = "hide", nullable = false)
    private boolean hide;
    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false)
    private Client client;

    public TrainingPlan() {
    }
    public TrainingPlan(int idTrainingPlan, String title, String description, String objective, String level, LocalDate startDate, LocalDate endDate, boolean status, boolean hide, Client client) {
        this.idTrainingPlan = idTrainingPlan;
        this.title = title;
        this.description = description;
        this.objective = objective;
        this.level = level;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.hide = hide;
        this.client = client;
    }

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
