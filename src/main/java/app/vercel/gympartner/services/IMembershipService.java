package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.entities.Membership;

import java.util.List;

public interface IMembershipService {
    public void create(Membership membership);
    List<Membership> list();
}
