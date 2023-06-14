package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Exercise;

import java.util.List;

public interface IExerciseService {
    public void insert(Exercise exercise);
    List<Exercise>list();
    public void delete(int idExercise);
    public Exercise listid(int idExercise);
    public void hide(int id);
}
