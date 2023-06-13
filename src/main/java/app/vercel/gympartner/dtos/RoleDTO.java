package app.vercel.gympartner.dtos;

import javax.persistence.Column;

public class RoleDTO {
    private int idRole;
    private String name;

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
}
