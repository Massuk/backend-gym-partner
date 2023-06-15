package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.MembershipDTO;
import app.vercel.gympartner.services.IMembershipService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/memberships")
public class MembershipController {
    @Autowired
    private IMembershipService mS;
    @GetMapping
    public List<MembershipDTO> list(){
        return mS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MembershipDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public MembershipDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        MembershipDTO dto = m.map(mS.listId(id), MembershipDTO.class);
        return dto;
    }
}
