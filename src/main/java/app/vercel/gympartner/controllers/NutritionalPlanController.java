package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.NutritionalPlanDTO;
import app.vercel.gympartner.dtos.TrainingPlanDTO;
import app.vercel.gympartner.entities.NutritionalPlan;
import app.vercel.gympartner.services.INutritionalPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/nutritionalPlans")
public class NutritionalPlanController {
    @Autowired
    private INutritionalPlanService npS;
    @GetMapping("/{idUser}")
    public List<NutritionalPlanDTO> list(@PathVariable("idUser") Integer idUser) {
        return npS.listNutritionalPlansByIdUser(idUser).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, NutritionalPlanDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/details/{id}")
    public NutritionalPlanDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        NutritionalPlanDTO dto = m.map(npS.listId(id), NutritionalPlanDTO.class);
        return dto;
    }
    @PostMapping
    public void insert(@RequestBody NutritionalPlanDTO dto) {
        ModelMapper m = new ModelMapper();
        NutritionalPlan tp = m.map(dto, NutritionalPlan.class);
        npS.insert(tp);
    }
    @PutMapping("/update")
    public void update(@RequestBody NutritionalPlanDTO dto) {
        ModelMapper m = new ModelMapper();
        NutritionalPlan tp = m.map(dto, NutritionalPlan.class);
        npS.insert(tp);
    }

    @PutMapping("/hide/{id}")
    public void hideNutritionalPlanByID(@PathVariable("id") Integer idNutritionalPlan){
        npS.hideNutritionalPlan(idNutritionalPlan);
    }
}