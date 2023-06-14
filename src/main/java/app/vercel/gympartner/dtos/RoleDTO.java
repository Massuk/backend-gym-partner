package app.vercel.gympartner.dtos;


public class RoleDTO {
    private int idRole;
    private String name;
    private boolean hide;

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
