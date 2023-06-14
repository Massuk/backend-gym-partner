package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "Exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExercise;

    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "repetitions", nullable = false)
    private int repetitions;
    @Column(name = "series", nullable = false)
    private int series;
    @Column(name = "kilograms", nullable = false)
    private int kilograms;
    @Column(name = "hide")
    private boolean hide;
    @ManyToOne
    @JoinColumn(name = "id_routine")
    private Routine routine;
    public Exercise(){}

    public Exercise(int idExercise, String name, int repetitions, int series, int kilograms, boolean hide, Routine routine) {
        this.idExercise = idExercise;
        this.name = name;
        this.repetitions = repetitions;
        this.series = series;
        this.kilograms = kilograms;
        this.hide = hide;
        this.routine = routine;
    }

    public int getIdExercise() {
        return idExercise;
    }

    public String getName() {
        return name;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getSeries() {
        return series;
    }

    public int getKilograms() {
        return kilograms;
    }

    public boolean isHide() {
        return hide;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }


}
