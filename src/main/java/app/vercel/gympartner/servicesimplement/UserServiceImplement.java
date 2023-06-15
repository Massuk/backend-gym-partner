package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public List<User> list() {
        return uR.findAll();
    }
}
