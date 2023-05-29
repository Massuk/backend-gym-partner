package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Gym;

import java.util.List;

public interface IGymService {
    public void create(Gym gym);

    List<Gym> list();

    public void delete(int idGym);

    public Gym listId(int idGym);
}
