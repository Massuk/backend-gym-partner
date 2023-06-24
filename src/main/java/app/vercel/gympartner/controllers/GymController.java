package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.GymDTO;
import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.IGymService;
import app.vercel.gympartner.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import app.vercel.gympartner.entities.User;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gyms")
public class GymController {
    @Autowired
    private IGymService gS;
    @Autowired
    private IUserRepository uR;

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public void insert(@RequestBody GymDTO dto) {
        ModelMapper m = new ModelMapper();
        Gym g = m.map(dto, Gym.class);

        // Obtener el correo electrónico del propietario autenticado
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();

        // Obtener el usuario por su correo electrónico
        User owner = uR.findByEmail(email);
        if (owner == null) {
            // Manejar el caso en el que el propietario no existe
            throw new RuntimeException("Owner not found with email: " + email);
        }

        // Asignar el ID del propietario al gimnasio
        g.getOwner().setIdUser(owner.getIdUser());

        gS.insert(g);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping
    public List<GymDTO> list(){
        return gS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, GymDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/{id}")
    public GymDTO listID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        GymDTO dto = m.map(gS.listId(id), GymDTO.class);
        return dto;
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("list/{username}")
    public GymDTO listGymByUsername(@PathVariable("username") String username) {
        ModelMapper m = new ModelMapper();
        GymDTO dto = m.map(gS.listGymByUsername(username), GymDTO.class);
        return dto;
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/update")
    public void update(@RequestBody GymDTO dto){
        ModelMapper m = new ModelMapper();
        Gym g = m.map(dto, Gym.class);
        gS.insert(g);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/hide/{id}")
    public void hideGymByID(@PathVariable("id") Integer id){
        gS.hideGym(id);
    }
}
