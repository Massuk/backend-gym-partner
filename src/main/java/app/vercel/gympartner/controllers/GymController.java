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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gyms")
public class GymController {
    @Autowired
    private IGymService gS;
    @Autowired
    private IUserRepository uR;

    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
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
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping
    public List<GymDTO> list(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Gym gym = gS.listGymByUsername(username);

        if (gym == null) {
            // Manejar el caso en el que el gimnasio no existe para el propietario actual
            throw new RuntimeException("Gym not found for owner: " + username);
        }

        List<GymDTO> gymDTOs = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        gymDTOs.add(modelMapper.map(gym, GymDTO.class));

        return gymDTOs;
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/{id}")
    public GymDTO listID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        GymDTO dto = m.map(gS.listId(id), GymDTO.class);
        return dto;
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("list/{username}")
    public GymDTO listGymByUsername(@PathVariable("username") String username) {
        ModelMapper m = new ModelMapper();
        GymDTO dto = m.map(gS.listGymByUsername(username), GymDTO.class);
        return dto;
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @PutMapping("/update")
    public void update(@RequestBody GymDTO dto){
        ModelMapper m = new ModelMapper();
        Gym g = m.map(dto, Gym.class);
        gS.insert(g);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @PutMapping("/hide/{id}")
    public void hideGymByID(@PathVariable("id") Integer id){
        gS.hideGym(id);
    }
}
