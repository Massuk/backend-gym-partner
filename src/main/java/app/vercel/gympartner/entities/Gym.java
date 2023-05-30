package app.vercel.gympartner.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "gyms")
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGym;
    @Column(name = "nameGym", length = 30, nullable = false)
    private String nameGym;
    @Column(name = "codeGym", length = 10, nullable = false)
    private String codeGym;
    @Column(name = "rucGym", length = 11, nullable = false)
    private String rucGym;
    @Column(name = "rsGym", length = 30, nullable = false)
    private String rsGym;

    public Gym() {

    }

    public Gym(int idGym, String nameGym, String codeGym, String rucGym, String rsGym) {
        this.idGym = idGym;
        this.nameGym = nameGym;
        this.codeGym = codeGym;
        this.rucGym = rucGym;
        this.rsGym = rsGym;
    }

    public int getIdGym() {
        return idGym;
    }

    public void setIdGym(int idGym) {
        this.idGym = idGym;
    }

    public String getNameGym() {
        return nameGym;
    }

    public void setNameGym(String nameGym) {
        this.nameGym = nameGym;
    }

    public String getCodeGym() {
        return codeGym;
    }

    public void setCodeGym(String codeGym) {
        this.codeGym = codeGym;
    }

    public String getRucGym() {
        return rucGym;
    }

    public void setRucGym(String rucGym) {
        this.rucGym = rucGym;
    }

    public String getRsGym() {
        return rsGym;
    }

    public void setRsGym(String rsGym) {
        this.rsGym = rsGym;
    }
}
