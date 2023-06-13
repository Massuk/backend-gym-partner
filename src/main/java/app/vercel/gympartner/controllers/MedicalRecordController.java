package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.GymDTO;
import app.vercel.gympartner.dtos.MedicalRecordDTO;
import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.entities.MedicalRecord;
import app.vercel.gympartner.services.IGymService;
import app.vercel.gympartner.services.IMedicalRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/medicalrecords")
public class MedicalRecordController {
    @Autowired
    private IMedicalRecordService mrS;

    @PostMapping
    public void create(@RequestBody MedicalRecordDTO dto){
        ModelMapper m = new ModelMapper();
        MedicalRecord mr = m.map(dto, MedicalRecord.class);
        mrS.create(mr);
    }

    @GetMapping
    public List<MedicalRecordDTO> list(){
        return mrS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MedicalRecordDTO.class);
        }).collect(Collectors.toList());
    }
}
