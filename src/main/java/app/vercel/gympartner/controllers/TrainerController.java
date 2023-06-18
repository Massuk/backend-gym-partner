package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.TrainerDTO;
import app.vercel.gympartner.entities.Trainer;
import app.vercel.gympartner.services.ITrainerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trainers")
public class TrainerController {
    @Autowired
    private ITrainerService tS;
    @GetMapping()
    public List<TrainerDTO> list() {
        return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TrainerDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/list/{id}")
    public TrainerDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TrainerDTO dto = m.map(tS.listId(id), TrainerDTO.class);
        return dto;
    }
    @PostMapping("/insert")
    public void insert(@RequestBody TrainerDTO dto) {
        ModelMapper m = new ModelMapper();
        Trainer t = m.map(dto, Trainer.class);
        tS.insert(t);
    }
    @PutMapping("/update")
    public void update(@RequestBody TrainerDTO dto) {
        ModelMapper m = new ModelMapper();
        Trainer t = m.map(dto, Trainer.class);
        tS.insert(t);
    }
    @PutMapping("/hide/{id}")
    public void hideTrainerByID(@PathVariable("id") Integer id){
        tS.hideTrainer(id);
    }
}
