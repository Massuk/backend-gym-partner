package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "gyms")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGym;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "code", length = 10, nullable = false)
    private String code;
    @Column(name = "ruc", length = 11, nullable = false)
    private String ruc;
    @Column(name = "reason", length = 30, nullable = false)
    private String reason;
    @Column(name = "hide", nullable = false)
    private boolean hide;
    @ManyToOne
    @JoinColumn(name = "idOwner")
    private Owner owner;
    @ManyToOne
    @JoinColumn(name = "idMembership")
    private Membership membership;

    public Gym() {
    }
    public Gym(int idGym, String name, String code, String ruc, String reason, boolean hide, Owner owner, Membership membership) {
        this.idGym = idGym;
        this.name = name;
        this.code = code;
        this.ruc = ruc;
        this.reason = reason;
        this.hide = hide;
        this.owner = owner;
        this.membership = membership;
    }

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
