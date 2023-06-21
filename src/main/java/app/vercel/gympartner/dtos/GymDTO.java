package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Owner;


public class GymDTO {
    private int idGym;
    private String name;
    private String code;
    private String ruc;
    private String rs;
    private boolean hide;
    private Owner owner;

    public int getIdGym() {
        return idGym;
    }
    public void setIdGym(int idGym) {
        this.idGym = idGym;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getRs() {
        return rs;
    }
    public void setRs(String rs) {
        this.rs = rs;
    }
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
