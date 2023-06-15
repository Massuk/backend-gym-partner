package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.MedicalRecord;
import app.vercel.gympartner.repositories.IMedicalRecordRepository;
import app.vercel.gympartner.services.IMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordServiceImplement implements IMedicalRecordService {
    @Autowired
    private IMedicalRecordRepository mrR;

    @Override
    public List<MedicalRecord> list() {
        return mrR.findAll();
    }
    @Override
    public MedicalRecord listId(int id) {
        return mrR.findById(id).orElse(new MedicalRecord());
    }
}
