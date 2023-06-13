package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.MedicalRecord;
import app.vercel.gympartner.entities.Membership;

import java.util.List;

public interface IMedicalRecordService {
    public void create(MedicalRecord medicalRecord);
    List<MedicalRecord> list();
}
