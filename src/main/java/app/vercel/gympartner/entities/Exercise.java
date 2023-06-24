package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "exercises")
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
    private double kilograms;
    @ManyToOne
    @JoinColumn(name = "id_routine", nullable = false)
    private Routine routine;

    public Exercise(){}
    public Exercise(int idExercise, String name, int repetitions, int series, int kilograms, Routine routine) {
        this.idExercise = idExercise;
        this.name = name;
        this.repetitions = repetitions;
        this.series = series;
        this.kilograms = kilograms;
        this.routine = routine;
    }

    public int getIdExercise() {
        return idExercise;
    }
    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRepetitions() {
        return repetitions;
    }
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public double getKilograms() {
        return kilograms;
    }
    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }
    public Routine getRoutine() {
        return routine;
    }
    public void setRoutine(Routine routine) {
        this.routine = routine;
    }
}
