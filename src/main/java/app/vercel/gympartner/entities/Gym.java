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
    @Column(name = "code", length = 20, nullable = false)
    private String code;
    @Column(name = "ruc", length = 11, nullable = false)
    private String ruc;
    @Column(name = "rs", length = 70, nullable = false)
    private String rs;
    @Column(name = "hide", nullable = false)
    private boolean hide;
    @OneToOne
    @JoinColumn(name = "idOwner", nullable = false)
    private Owner owner;

    public Gym() {
    }
    public Gym(int idGym, String name, String code, String ruc, String rs, boolean hide, Owner owner) {
        this.idGym = idGym;
        this.name = name;
        this.code = code;
        this.ruc = ruc;
        this.rs = rs;
        this.hide = hide;
        this.owner = owner;
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
