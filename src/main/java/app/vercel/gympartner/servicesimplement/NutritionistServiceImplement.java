package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Nutritionist;
import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.INutritionistRepository;
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

    @Override
    public void insert(Nutritionist nutritionist) {
        User user = new User();
        user.setEmail(nutritionist.getEmail());
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode(nutritionist.getPassword());
        nutritionist.setPassword(password);
        int emailInUse = uR.validateEmail(user.getEmail());
        if (emailInUse == 0) {
            uR.save(nutritionist);
        }
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
