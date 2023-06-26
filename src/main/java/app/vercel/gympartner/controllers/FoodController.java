package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.FoodDTO;
import app.vercel.gympartner.entities.Food;
import app.vercel.gympartner.services.IFoodService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private IFoodService fS;

    // List all Food
    @GetMapping("/{idMeal}")
    public List<FoodDTO> list(@PathVariable ("idMeal")Integer idMeal){
        return fS.listFoodsByIdMeal(idMeal).stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FoodDTO.class);
        }).collect(Collectors.toList());
    }
    // List Food by ID
    @GetMapping("/details/{id}")
    public FoodDTO listID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FoodDTO dto = m.map(fS.listId(id), FoodDTO.class);
        return dto;
    }
    // Create Food
    @PostMapping
    public void insert(@RequestBody FoodDTO dto){
        ModelMapper m = new ModelMapper();
        Food f = m.map(dto, Food.class);
        fS.insert(f);
    }
    // Update Food
    @PutMapping("/update")
    public void update(@RequestBody FoodDTO dto){
        ModelMapper m = new ModelMapper();
        Food f = m.map(dto, Food.class);
        fS.insert(f);
    }
    //Delete Food by ID
    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable("id") Integer id){
        fS.delete(id);
    }
}
