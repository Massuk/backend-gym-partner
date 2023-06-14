package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Membership;
import app.vercel.gympartner.repositories.IMembershipRepository;
import app.vercel.gympartner.services.IMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MembershipServiceImplement implements IMembershipService {
    @Autowired
    private IMembershipRepository mR;

    @Override
    public void create(Membership membership) {
        mR.save(membership);
    }

    @Override
    public List<Membership> list() {
        //List<Membership> demoList = new ArrayList<>();
//
        //Membership m1 = new Membership();
        //m1.setIdMembership(1);
        //m1.setName("Membership Basic");
        //m1.setTrainerCapacity(5);
        //m1.setNutriCapacity(5);
        //m1.setClientsCapacity(50);
        //m1.setPrice(19.99f);
//
        //Membership m2 = new Membership();
        //m2.setIdMembership(2);
        //m2.setName("Membership Platinum");
        //m2.setTrainerCapacity(10);
        //m2.setNutriCapacity(10);
        //m2.setClientsCapacity(100);
        //m2.setPrice(39.99f);
//
        //Membership m3 = new Membership();
        //m3.setIdMembership(3);
        //m3.setName("Membership Gold");
        //m3.setTrainerCapacity(20);
        //m3.setNutriCapacity(20);
        //m3.setClientsCapacity(400);
        //m3.setPrice(79.99f);
//
        //demoList.add(m1);
        //demoList.add(m2);
        //demoList.add(m3);
//
        return mR.findAll();
    }
}
