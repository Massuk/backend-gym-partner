package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Owner;

import java.util.List;

public interface IOwnerService {
    void insert(Owner owner, boolean edit);
    List<Owner> list();
    Owner listId(int id);
}