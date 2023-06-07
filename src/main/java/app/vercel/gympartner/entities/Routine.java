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
    @Column(name="day", length = 20, nullable = false)
    private String day;
    @ManyToOne
    @JoinColumn(name = "id_tplan", nullable = false, foreignKey = @ForeignKey(name = "id_routine_tplan"))
    private TrainingPlan tPlan;

    public Routine() {
    }

    public Routine(int idRoutine, String title, String day, TrainingPlan tPlan) {
        this.idRoutine = idRoutine;
        this.title = title;
        this.day = day;
        this.tPlan = tPlan;
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

    public TrainingPlan gettPlan() {
        return tPlan;
    }

    public void settPlan(TrainingPlan tPlan) {
        this.tPlan = tPlan;
    }
}
