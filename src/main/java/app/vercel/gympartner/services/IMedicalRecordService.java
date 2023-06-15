package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.MedicalRecord;

import java.util.List;

public interface IMedicalRecordService {
    List<MedicalRecord> list();
    MedicalRecord listId(int id);
}
