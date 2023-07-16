package app.vercel.gympartner.dtos;

public class GymByOwnerDTO {
    private String ownerName;
    private String gymName;

    public String getOwnerName() {
        return ownerName;
    }

    public String getGymName() {
        return gymName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }
}
