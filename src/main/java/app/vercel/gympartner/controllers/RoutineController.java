package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.RoutineDTO;
import app.vercel.gympartner.entities.Routine;
import app.vercel.gympartner.services.IRoutineService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/routines")
public class RoutineController {
    @Autowired
    private IRoutineService rS;

    @GetMapping("/{idTrainingPlan}")
    public List<RoutineDTO> list(@PathVariable("idTrainingPlan") Integer idTrainingPlan) {
        return rS.listRoutinesByIdTrainingPlan(idTrainingPlan).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoutineDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/details/{id}")
    public RoutineDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        RoutineDTO dto = m.map(rS.listId(id), RoutineDTO.class);
        return dto;
    }
    @PostMapping
    public void insert(@RequestBody RoutineDTO dto) {
        ModelMapper m = new ModelMapper();
        Routine v = m.map(dto, Routine.class);
        rS.insert(v);
    }
    @PutMapping("/update")
    public void update(@RequestBody RoutineDTO dto) {
        ModelMapper m = new ModelMapper();
        Routine r = m.map(dto, Routine.class);
        rS.insert(r);
    }
    @PutMapping("/hide/{id}")
    public void hideExercise(@PathVariable("id") Integer idRoutine){
        rS.hideExercise(idRoutine);
    }
}
