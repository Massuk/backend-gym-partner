package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Owner;
import app.vercel.gympartner.entities.Role;
import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.IOwnerRepository;
import app.vercel.gympartner.repositories.IRoleRepository;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImplement implements IOwnerService {
    @Autowired
    private IOwnerRepository oR;
    @Autowired
    private IUserRepository uR;
    @Autowired
    private IRoleRepository rR;
    @Override
    public void insert(Owner owner, boolean edit) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode(owner.getPassword());
        owner.setPassword(password);

        if (edit) {
            uR.save(owner);
        } else {
            User user = new User();
            user.setEmail(owner.getEmail());
            int emailInUse = uR.validateEmail(user.getEmail());
            if (emailInUse == 0) {
                Role role = rR.findById(1)
                        .orElseThrow(() -> new RuntimeException("Role not found"));
                owner.setRole(role);
                uR.save(owner);
            }
        }
    }
    @Override
    public List<Owner> list() {
        return oR.findAll();
    }
    @Override
    public Owner listId(int id) {
        return oR.findById(id).orElse(new Owner());
    }
}
