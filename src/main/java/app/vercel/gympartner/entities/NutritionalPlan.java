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
    @Column (name = "status", nullable = false)
    private boolean status;
    @Column (name = "hide", nullable = false)
    private boolean hide;
    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false)
    private Client client;

    public NutritionalPlan() {
    }
    public NutritionalPlan(int idNutritionalPlan, String title, String objective, String description, LocalDate startDate, LocalDate endDate, String recommendations, boolean status, boolean hide, Client client) {
        this.idNutritionalPlan = idNutritionalPlan;
        this.title = title;
        this.objective = objective;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recommendations = recommendations;
        this.status = status;
        this.hide = hide;
        this.client = client;
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
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public String getRecommendations() {
        return recommendations;
    }
    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
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
