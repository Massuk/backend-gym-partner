package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Membership;
import app.vercel.gympartner.repositories.IMembershipRepository;
import app.vercel.gympartner.services.IMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class MembershipServiceImplement implements IMembershipService {
    @Autowired
    private IMembershipRepository mR;

    @Override
    public List<Membership> list() {
        return mR.findAll();
    }
    @Override
    public Membership listId(int id) {
        return mR.findById(id).orElse(new Membership());
    }
}
