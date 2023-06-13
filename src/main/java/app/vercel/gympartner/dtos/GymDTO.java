package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Membership;

import javax.persistence.Column;

public class GymDTO {
    private int idGym;
    private String nameGym;
    private String codeGym;
    private String rucGym;
    private String rsGym;
    private boolean statusGym;
    private Membership membership;

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

    public boolean isStatusGym() {
        return statusGym;
    }

    public void setStatusGym(boolean statusGym) {
        this.statusGym = statusGym;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }
}
