package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Trainer;

import java.util.List;

public interface ITrainerService {
    void insert(Trainer trainer);
    List<Trainer> list();
    Trainer listId(int id);
    List<Trainer> listTrainersByUsername(String username);
}
