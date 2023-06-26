package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.ClientDTO;
import app.vercel.gympartner.entities.Client;
import app.vercel.gympartner.services.IClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private IClientService cS;

    @GetMapping("/{username}")
    public List<ClientDTO> listClientsByUsername(@PathVariable("username") String username) {
        return cS.listClientsByUsername(username).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/details/{id}")
    public ClientDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ClientDTO dto = m.map(cS.listId(id), ClientDTO.class);
        return dto;
    }
    @PostMapping
    public void insert(@RequestBody ClientDTO dto) {
        ModelMapper m = new ModelMapper();
        Client c = m.map(dto, Client.class);
        cS.insert(c);
    }
    @PutMapping
    public void update(@RequestBody ClientDTO dto) {
        ModelMapper m = new ModelMapper();
        Client c = m.map(dto, Client.class);
        cS.insert(c);
    }
}
