package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "medicalRecords")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedicalRecord;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @OneToOne
    @JoinColumn(name = "idClient", nullable = false)
    private Client client;

    public MedicalRecord() {
    }
    public MedicalRecord(int idMedicalRecord, String name, Client client) {
        this.idMedicalRecord = idMedicalRecord;
        this.name = name;
        this.client = client;
    }

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
