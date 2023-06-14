package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "Exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExercise;

    @Column(name = "nameExercise", length = 30, nullable = false)
    private String nameExercise;
    @Column(name = "repetitionsExercise",length = 2, nullable = false)
    private int repetitionsExercise;
    @Column(name = "seriesExercise",length = 2, nullable = false)
    private int seriesExercise;
    @Column(name = "kilogramsExercise",length = 2, nullable = false)
    private int kilogramsExercise;
    @Column(name = "statusExercise")
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "id_routine")
    private Routine routine;
    public Exercise(){}

    public Exercise(int idExercise, String nameExercise, int repetitionsExercise, int seriesExercise, int kilogramsExercise, Routine routine) {
        this.idExercise = idExercise;
        this.nameExercise = nameExercise;
        this.repetitionsExercise = repetitionsExercise;
        this.seriesExercise = seriesExercise;
        this.kilogramsExercise = kilogramsExercise;
        this.routine = routine;
        this.status = true;
    }

    public int getIdExercise() {
        return idExercise;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public int getRepetitionsExercise() {
        return repetitionsExercise;
    }

    public int getSeriesExercise() {
        return seriesExercise;
    }

    public int getKilogramsExercise() {
        return kilogramsExercise;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }

    public void setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
    }

    public void setRepetitionsExercise(int repetitionsExercise) {
        this.repetitionsExercise = repetitionsExercise;
    }

    public void setSeriesExercise(int seriesExercise) {
        this.seriesExercise = seriesExercise;
    }
    public void setKilogramsExercise(int kilogramsExercise) {
        this.kilogramsExercise = kilogramsExercise;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}