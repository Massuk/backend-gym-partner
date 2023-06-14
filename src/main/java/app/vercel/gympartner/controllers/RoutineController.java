package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.RoutineDTO;
import app.vercel.gympartner.dtos.TrainingPlanDTO;
import app.vercel.gympartner.entities.Routine;
import app.vercel.gympartner.entities.TrainingPlan;
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
    @PostMapping
    public void insert(@RequestBody RoutineDTO dto) {
        ModelMapper m = new ModelMapper();
        Routine v = m.map(dto, Routine.class);
        rS.insert(v);
    }
    @GetMapping
    public List<RoutineDTO> list() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoutineDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void update(@RequestBody RoutineDTO dto) {
        ModelMapper m = new ModelMapper();
        Routine r = m.map(dto, Routine.class);
        rS.insert(r);
    }
    @PutMapping("/hide/{id}")
    public void hideExercise(@PathVariable("id") Integer idRoutine){
        rS.hideExercise(idRoutine);
    }
    /*
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        rS.delete(id);
    }

     */
}
