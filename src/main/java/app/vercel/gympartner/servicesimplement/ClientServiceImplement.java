package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.Client;
import app.vercel.gympartner.repositories.IClientRepository;
import app.vercel.gympartner.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImplement implements IClientService {
    @Autowired
    private IClientRepository cR;

    @Override
    public void insert(Client client) {
        cR.save(client);
    }
    @Override
    public List<Client> listClientsByUsername(String username) {
        return cR.listClientsByUsername(username);
    }
    @Override
    public Client listId(int id) {
        return cR.findById(id).orElse(new Client());
    }
}
