package app.vercel.gympartner.controllers;

import app.vercel.gympartner.GymPartnerApplication;
import app.vercel.gympartner.dtos.TrainingPlanDTO;
import app.vercel.gympartner.entities.TrainingPlan;
import app.vercel.gympartner.services.ITrainingPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trainingPlans")
public class TrainingPlanController {

    @Autowired
    private ITrainingPlanService tpS;

    // List all TrainingPlans
    @GetMapping("/{idUser}")
    public List<TrainingPlanDTO> list(@PathVariable("idUser") Integer idUser) {
        return tpS.listTrainingPlansByIdUser(idUser).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TrainingPlanDTO.class);
        }).collect(Collectors.toList());
    }

    // List Training Plan by ID
    @GetMapping("/details/{id}")
    public TrainingPlanDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TrainingPlanDTO dto = m.map(tpS.listId(id), TrainingPlanDTO.class);
        return dto;
    }

    // Insert Training Plan
    @PostMapping
    public void insert(@RequestBody TrainingPlanDTO dto) {
        ModelMapper m = new ModelMapper();
        TrainingPlan tp = m.map(dto, TrainingPlan.class);
        tpS.insert(tp);
    }

    // Update Training Plan
    @PutMapping("/update")
    public void update(@RequestBody TrainingPlanDTO dto) {
        ModelMapper m = new ModelMapper();
        TrainingPlan tp = m.map(dto, TrainingPlan.class);
        tpS.insert(tp);
    }

    //HIDE TRAINING PLAN
    @PutMapping("/hide/{id}")
    public void hideTrainingPlan(@PathVariable("id") Integer idTplan){
        tpS.hideTrainingPlan(idTplan);
    }
}
