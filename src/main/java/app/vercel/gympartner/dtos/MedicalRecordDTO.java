package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Client;


public class MedicalRecordDTO {
    private int idMedicalRecord;
    private String name;
    private Client client;

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }
    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
}
