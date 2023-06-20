package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.RoleDTO;
import app.vercel.gympartner.entities.Role;
import app.vercel.gympartner.services.IRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;
    @GetMapping
    public List<RoleDTO> list() {
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public RoleDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listId(id), RoleDTO.class);
        return dto;
    }
    @PostMapping
    public void insert(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
    @PutMapping
    public void update(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
}
