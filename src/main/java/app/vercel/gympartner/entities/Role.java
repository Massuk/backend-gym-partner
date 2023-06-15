package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue
    private int idRole;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "hide", nullable = false)
    private boolean hide;

    public Role() {
    }
    public Role(int idRole, String name, boolean hide) {
        this.idRole = idRole;
        this.name = name;
        this.hide = hide;
    }

    public int getIdRole() {
        return idRole;
    }
    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
}
