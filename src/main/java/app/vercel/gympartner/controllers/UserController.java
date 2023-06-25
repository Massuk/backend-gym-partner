package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.UserDTO;
import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;
    @Autowired
    private IUserRepository uR;
    @PreAuthorize("hasAuthority('ADMINISTRADOR') || hasAuthority('ENTRENADOR') || hasAuthority('NUTRICIONISTA')")
    @GetMapping
    public List<UserDTO> list() {
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') || hasAuthority('ENTRENADOR') || hasAuthority('NUTRICIONISTA')")
    @GetMapping("/info")
    public ResponseEntity<UserDTO> getUserInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();

        User user = uR.findByEmail(email);
        if (user == null) {
            // Manejar el caso en el que el usuario no existe
            throw new RuntimeException("User not found with email: " + email);
        }

        // Mapear el objeto User a UserDTO para enviar solo los datos necesarios al frontend
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);

        return ResponseEntity.ok(userDTO);
    }
}
