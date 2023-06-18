package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.MealDTO;
import app.vercel.gympartner.entities.Meal;
import app.vercel.gympartner.services.IMealService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/meals")
public class MealController {
    @Autowired
    private IMealService mS;
    @PostMapping
    public void insert(@RequestBody MealDTO dto) {
        ModelMapper m = new ModelMapper();
        Meal v = m.map(dto, Meal.class);
        mS.insert(v);
    }
    @GetMapping
    public List<MealDTO> list() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MealDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping("/update")
    public void update(@RequestBody MealDTO dto) {
        ModelMapper m = new ModelMapper();
        Meal r = m.map(dto, Meal.class);
        mS.insert(r);
    }
    @PutMapping("/hide/{id}")
    public void hideMeal(@PathVariable("id") Integer idMeal){
        mS.hideMeal(idMeal);
    }



    /*
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        rS.delete(id);
    }

     */
}
