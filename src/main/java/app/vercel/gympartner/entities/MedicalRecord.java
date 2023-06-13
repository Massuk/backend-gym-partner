package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "medicalRecord")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedicalRecord;
    @Column(name = "title", length = 30, nullable = false)
    private String title;
    @Column(name = "medicoCabecera", length = 150, nullable = false)
    private String medicoCabecera;
    @Column(name = "diagnostico", length = 150, nullable = false)
    private String diagnostico;
    @Column(name = "enTratamiento", nullable = false)
    private boolean enTratamiento;

    public MedicalRecord() {
    }

    public MedicalRecord(int idMedicalRecord, String title, String medicoCabecera, String diagnostico, boolean enTratamiento) {
        this.idMedicalRecord = idMedicalRecord;
        this.title = title;
        this.medicoCabecera = medicoCabecera;
        this.diagnostico = diagnostico;
        this.enTratamiento = enTratamiento;
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMedicoCabecera() {
        return medicoCabecera;
    }

    public void setMedicoCabecera(String medicoCabecera) {
        this.medicoCabecera = medicoCabecera;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isEnTratamiento() {
        return enTratamiento;
    }

    public void setEnTratamiento(boolean enTratamiento) {
        this.enTratamiento = enTratamiento;
    }
}
