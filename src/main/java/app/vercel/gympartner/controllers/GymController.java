package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.GymDTO;
import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.services.IGymService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gyms")
public class GymController {
    @Autowired
    private IGymService gS;

    @PostMapping
    public void insert(@RequestBody GymDTO dto){
        ModelMapper m = new ModelMapper();
        Gym g = m.map(dto, Gym.class);
        gS.insert(g);
    }
    @GetMapping
    public List<GymDTO> list(){
        return gS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, GymDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public GymDTO listID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        GymDTO dto = m.map(gS.listId(id), GymDTO.class);
        return dto;
    }
    @GetMapping("list/{username}")
    public GymDTO listGymByUsername(@PathVariable("username") String username) {
        ModelMapper m = new ModelMapper();
        GymDTO dto = m.map(gS.listGymByUsername(username), GymDTO.class);
        return dto;
    }
    @PutMapping("/update")
    public void update(@RequestBody GymDTO dto){
        ModelMapper m = new ModelMapper();
        Gym g = m.map(dto, Gym.class);
        gS.insert(g);
    }
    @PutMapping("/hide/{id}")
    public void hideGymByID(@PathVariable("id") Integer id){
        gS.hideGym(id);
    }
}
