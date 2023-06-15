package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Membership;
import app.vercel.gympartner.entities.Owner;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class GymDTO {
    private int idGym;
    private String name;
    private String code;
    private String ruc;
    private String reason;
    private boolean hide;
    private Owner owner;
    private Membership membership;

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
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
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
    public Membership getMembership() {
        return membership;
    }
    public void setMembership(Membership membership) {
        this.membership = membership;
    }
}
