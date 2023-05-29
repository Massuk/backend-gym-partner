package app.vercel.gympartner.dtos;

import javax.persistence.Column;

public class GymDTO {
    private int idGym;
    private String nameGym;
    private String codeGym;
    private int rucGym;
    private String rsGym;

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

    public int getRucGym() {
        return rucGym;
    }

    public void setRucGym(int rucGym) {
        this.rucGym = rucGym;
    }

    public String getRsGym() {
        return rsGym;
    }

    public void setRsGym(String rsGym) {
        this.rsGym = rsGym;
    }
}
