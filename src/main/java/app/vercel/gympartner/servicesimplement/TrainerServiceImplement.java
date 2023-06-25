package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Role;
import app.vercel.gympartner.entities.Trainer;
import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.IRoleRepository;
import app.vercel.gympartner.repositories.ITrainerRepository;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.ITrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImplement implements ITrainerService {
    @Autowired
    private ITrainerRepository tR;
    @Autowired
    IUserRepository uR;
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Trainer trainer, boolean edit) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode(trainer.getPassword());
        trainer.setPassword(password);

        if (edit) {
            tR.save(trainer);
        } else {
            User user = new User();
            user.setEmail(trainer.getEmail());
            int emailInUse = uR.validateEmail(user.getEmail());
            if (emailInUse == 0) {
                Role role = rR.findById(3)
                        .orElseThrow(() -> new RuntimeException("Role not found"));
                trainer.setRole(role);
                uR.save(trainer);
            }
        }
    }

    @Override
    public List<Trainer> list() {
        return tR.findAll();
    }
    @Override
    public Trainer listId(int id) {
        return tR.findById(id).orElse(new Trainer());
    }

    @Override
    public List<Trainer> listTrainersByUsername(String username) {
        return tR.listTrainersByUsername(username);
    }
}
