package app.vercel.gympartner.controllers;

import app.vercel.gympartner.dtos.MedicalRecordDTO;
import app.vercel.gympartner.services.IMedicalRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/medicalRecords")
public class MedicalRecordController {
    @Autowired
    private IMedicalRecordService mrS;

    @GetMapping
    public List<MedicalRecordDTO> list() {
        return mrS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MedicalRecordDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public MedicalRecordDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        MedicalRecordDTO dto = m.map(mrS.listId(id), MedicalRecordDTO.class);
        return dto;
    }
}
