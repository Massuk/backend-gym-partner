package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Role;
import app.vercel.gympartner.repositories.IRoleRepository;
import app.vercel.gympartner.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }
    @Override
    public List<Role> list() {
        return rR.findAll();
    }
    @Override
    public Role listId(int id) {
        return rR.findById(id).orElse(new Role());
    }
}
