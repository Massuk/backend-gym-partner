package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.GymDTO;
import app.vercel.gympartner.dtos.MembershipDTO;
import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.entities.Membership;
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
    @PostMapping
    public void create(@RequestBody MembershipDTO dto){
        ModelMapper m = new ModelMapper();
        Membership membership = m.map(dto, Membership.class);
        mS.create(membership);
    }
    @GetMapping
    public List<MembershipDTO> list(){
        return mS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MembershipDTO.class);
        }).collect(Collectors.toList());
    }
}
