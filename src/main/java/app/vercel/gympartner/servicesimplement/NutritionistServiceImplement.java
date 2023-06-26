package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Nutritionist;
import app.vercel.gympartner.entities.Role;
import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.INutritionistRepository;
import app.vercel.gympartner.repositories.IRoleRepository;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.INutritionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionistServiceImplement implements INutritionistService {
    @Autowired
    private INutritionistRepository nR;
    @Autowired
    private IUserRepository uR;
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Nutritionist nutritionist) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode(nutritionist.getPassword());
        User user = uR.findByEmail(nutritionist.getEmail());

        if (user == null) {
            Role role = rR.findById(2)
                    .orElseThrow(() -> new RuntimeException("Role not found"));
            nutritionist.setRole(role);
            nutritionist.setPassword(password);
        }
        nR.save(nutritionist);
    }
    @Override
    public List<Nutritionist> list() {
        return nR.findAll();
    }
    @Override
    public Nutritionist listId(int id) {
        return nR.findById(id).orElse(new Nutritionist());
    }
    @Override
    public List<Nutritionist> listNutritionistsByUsername(String username) {
        return nR.listNutritionistsByUsername(username);
    }
}
