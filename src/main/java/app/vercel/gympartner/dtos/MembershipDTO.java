package app.vercel.gympartner.dtos;

public class MembershipDTO {
    private int idMembership;
    private String name;
    private int trainerCapacity;
    private int nutriCapacity;
    private int clientsCapacity;
    private float price;

    public int getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(int idMembership) {
        this.idMembership = idMembership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainerCapacity() {
        return trainerCapacity;
    }

    public void setTrainerCapacity(int trainerCapacity) {
        this.trainerCapacity = trainerCapacity;
    }

    public int getNutriCapacity() {
        return nutriCapacity;
    }

    public void setNutriCapacity(int nutriCapacity) {
        this.nutriCapacity = nutriCapacity;
    }

    public int getClientsCapacity() {
        return clientsCapacity;
    }

    public void setClientsCapacity(int clientsCapacity) {
        this.clientsCapacity = clientsCapacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
