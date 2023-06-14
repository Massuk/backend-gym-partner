package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Routine;

public class ExerciseDTO {

    private int idExercise;
    private String name;
    private int repetitions;
    private int series;
    private int kilograms;
    private boolean hide;
    private Routine routine;

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

    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public boolean isHide() {
        return hide;
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
