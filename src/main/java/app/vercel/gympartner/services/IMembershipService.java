package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Membership;

import java.util.List;

public interface IMembershipService {
    List<Membership> list();
    Membership listId(int id);
}
