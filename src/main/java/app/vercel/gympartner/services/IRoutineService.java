package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Routine;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRoutineService {
    public void insert(Routine routine);
    List<Routine> list();
    public void delete(int idTplan);
    void hideExercise(int id);
}
