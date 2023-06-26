package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.OwnerDTO;
import app.vercel.gympartner.entities.Owner;
import app.vercel.gympartner.services.IOwnerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    private IOwnerService oS;

    @GetMapping
    public List<OwnerDTO> list() {
        return oS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, OwnerDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public OwnerDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        OwnerDTO dto = m.map(oS.listId(id), OwnerDTO.class);
        return dto;
    }
    @PostMapping
    public void insert(@RequestBody OwnerDTO dto) {
        ModelMapper m = new ModelMapper();
        Owner o = m.map(dto, Owner.class);
        oS.insert(o);
    }
    @PutMapping("/update")
    public void update(@RequestBody OwnerDTO dto) {
        ModelMapper m = new ModelMapper();
        Owner o = m.map(dto, Owner.class);
        oS.insert(o);
    }
}
