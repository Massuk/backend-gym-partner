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
    @PreAuthorize("hasAuthority('ENTRENADOR')")
    @PostMapping
    public void insert(@RequestBody ExerciseDTO dto){
        ModelMapper m = new ModelMapper();
        Exercise e = m.map(dto, Exercise.class);
        eS.insert(e);
    }
    @PreAuthorize("hasAuthority('ENTRENADOR')")
    @GetMapping
    public List<ExerciseDTO> list(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ExerciseDTO.class);

        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ENTRENADOR')")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        eS.delete(id);
    }

    @PreAuthorize("hasAuthority('ENTRENADOR')")
    @GetMapping("/{id}")
    public ExerciseDTO listid(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ExerciseDTO dto = m.map(eS.listid(id), ExerciseDTO.class);
        return dto;
    }
    @PreAuthorize("hasAuthority('ENTRENADOR')")
    @PutMapping("/update")
    public void update(@RequestBody ExerciseDTO dto){
        ModelMapper m = new ModelMapper();
        Exercise e = m.map(dto,Exercise.class);
        eS.insert(e);
    }

}
