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

    @PostMapping
    public void create(@RequestBody FoodDTO dto){
        ModelMapper m = new ModelMapper();
        Food f = m.map(dto, Food.class);
        fS.create(f);
    }

    @GetMapping
    public List<FoodDTO> list(){
        return fS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FoodDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id") Integer id){
        fS.delete(id);
    }

    @GetMapping("/{id}")
    public FoodDTO listID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FoodDTO dto = m.map(fS.listId(id), FoodDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody FoodDTO dto){
        ModelMapper m = new ModelMapper();
        Food f = m.map(dto, Food.class);
        fS.create(f);
    }
}
