package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.ExerciseDTO;
import app.vercel.gympartner.entities.Exercise;
import app.vercel.gympartner.services.IExerciseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {
    @Autowired
    private IExerciseService eS;

    @GetMapping("/{idRoutine}")
    public List<ExerciseDTO> list(@PathVariable ("idRoutine")Integer idRoutine){
        return eS.listExercisesByIdRoutine(idRoutine).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ExerciseDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insert(@RequestBody ExerciseDTO dto){
        ModelMapper m = new ModelMapper();
        Exercise e = m.map(dto, Exercise.class);
        eS.insert(e);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id")Integer id){
        eS.delete(id);
    }
    @GetMapping("/details/{id}")
    public ExerciseDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ExerciseDTO dto = m.map(eS.listId(id), ExerciseDTO.class);
        return dto;
    }
    @PutMapping("/update")
    public void update(@RequestBody ExerciseDTO dto){
        ModelMapper m = new ModelMapper();
        Exercise e = m.map(dto,Exercise.class);
        eS.insert(e);
    }
}
