package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Client;

import java.util.List;

public interface IClientService {
    void insert(Client client);
    List<Client> list();
    Client listId(int id);
}
