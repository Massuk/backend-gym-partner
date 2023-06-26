package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.NutritionistDTO;
import app.vercel.gympartner.entities.Nutritionist;
import app.vercel.gympartner.services.INutritionistService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/nutritionists")
public class NutritionistController {
    @Autowired
    private INutritionistService nS;

    @GetMapping
    public List<NutritionistDTO> list() {
        return nS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, NutritionistDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("list/{username}")
    public List<NutritionistDTO> listNutritionistsByUsername(@PathVariable("username") String username) {
        return nS.listNutritionistsByUsername(username).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, NutritionistDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("details/{id}")
    public NutritionistDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        NutritionistDTO dto = m.map(nS.listId(id), NutritionistDTO.class);
        return dto;
    }
    @PostMapping
    public void insert(@RequestBody NutritionistDTO dto) {
        ModelMapper m = new ModelMapper();
        Nutritionist t = m.map(dto, Nutritionist.class);
        nS.insert(t);
    }
    @PutMapping
    public void update(@RequestBody NutritionistDTO dto) {
        ModelMapper m = new ModelMapper();
        Nutritionist t = m.map(dto, Nutritionist.class);
        nS.insert(t);
    }
}
