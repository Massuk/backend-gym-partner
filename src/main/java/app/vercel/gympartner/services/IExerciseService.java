package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Exercise;

import java.util.List;

public interface IExerciseService {
    List<Exercise>listExercisesByIdRoutine(int idRoutine);
    public void insert(Exercise exercise);
    public void delete(int idExercise);
    public Exercise listId(int idExercise);
}
