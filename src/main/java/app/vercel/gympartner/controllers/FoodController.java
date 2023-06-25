package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.ExerciseDTO;
import app.vercel.gympartner.dtos.FoodDTO;
import app.vercel.gympartner.dtos.MealDTO;
import app.vercel.gympartner.entities.Exercise;
import app.vercel.gympartner.entities.Food;
import app.vercel.gympartner.entities.Meal;
import app.vercel.gympartner.services.IFoodService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private IFoodService fS;

    @PreAuthorize("hasAuthority('NUTRICIONISTA')")
    @PostMapping
    public void insert(@RequestBody FoodDTO dto){
        ModelMapper m = new ModelMapper();
        Food e = m.map(dto, Food.class);
        fS.insert(e);
    }

    // List all Food
    @GetMapping
    @PreAuthorize("hasAuthority('NUTRICIONISTA')")
    public List<FoodDTO> list(){
        return fS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FoodDTO.class);
        }).collect(Collectors.toList());
    }

    // List Food by ID
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('NUTRICIONISTA')")
    public FoodDTO listID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FoodDTO dto = m.map(fS.listId(id), FoodDTO.class);
        return dto;
    }

    // Update Food
    @PutMapping("/update")
    @PreAuthorize("hasAuthority('NUTRICIONISTA')")
    public void update(@RequestBody FoodDTO dto){
        ModelMapper m = new ModelMapper();
        Food f = m.map(dto, Food.class);
        fS.insert(f);
    }

    //Delete Food by ID
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('NUTRICIONISTA')")
    public void delete (@PathVariable("id") Integer id){
        fS.delete(id);
    }


}
