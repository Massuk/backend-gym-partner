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
    @Column(name = "status", nullable = false)
    private boolean status;

    public Role() {
    }

    public Role(int idRole, String name, boolean status) {
        this.idRole = idRole;
        this.name = name;
        this.status = status;
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
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
