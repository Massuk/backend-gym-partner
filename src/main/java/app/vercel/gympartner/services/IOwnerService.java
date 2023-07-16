package app.vercel.gympartner.services;

import app.vercel.gympartner.dtos.GymByOwnerDTO;
import app.vercel.gympartner.entities.Owner;

import java.util.List;

public interface IOwnerService {
    void insert(Owner owner);
    List<Owner> list();
    Owner listId(int id);
    List<GymByOwnerDTO> gymByOwner();
}