package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Routine;

public class ExerciseDTO {

    private int idExercise;
    private String nameExercise;
    private int repetitionsExercise;
    private int seriesExercise;
    private int kilogramsExercise;
    private Routine routine;

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
}
