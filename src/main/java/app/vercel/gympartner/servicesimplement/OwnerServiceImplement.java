package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Owner;
import app.vercel.gympartner.repositories.IOwnerRepository;
import app.vercel.gympartner.services.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImplement implements IOwnerService {
    @Autowired
    private IOwnerRepository oR;
    @Override
    public void insert(Owner owner) {
        oR.save(owner);
    }
    @Override
    public List<Owner> list() {
        return oR.findAll();
    }
    @Override
    public Owner listId(int id) {
        return oR.findById(id).orElse(new Owner());
    }
    @Override
    public void disable(int id) {
        oR.disable(id);
    }
}
