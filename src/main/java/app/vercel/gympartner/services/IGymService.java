package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Gym;

import java.util.List;

public interface IGymService {
    void insert(Gym gym);
    List<Gym> list();
    Gym listId(int idGym);
    void hideGym(int id);
    Gym listGymByUsername(String username);
}
