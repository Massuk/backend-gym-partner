package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.MealDTO;
import app.vercel.gympartner.dtos.RoutineDTO;
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

    @GetMapping("/{idNutritionalPlan}")
    public List<MealDTO> list(@PathVariable("idNutritionalPlan") Integer idNutritionalPlan) {
        return mS.listMealsByIdNutritionalPlan(idNutritionalPlan).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MealDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/details/{id}")
    public MealDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        MealDTO dto = m.map(mS.listId(id), MealDTO.class);
        return dto;
    }
    @PostMapping
    public void insert(@RequestBody MealDTO dto) {
        ModelMapper m = new ModelMapper();
        Meal v = m.map(dto, Meal.class);
        mS.insert(v);
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
}