package app.vercel.gympartner.dtos;


public class MembershipDTO {
    private int idMembership;
    private String name;
    private int trainersCapacity;
    private int nutritionistsCapacity;
    private int clientsCapacity;
    private float price;
    private boolean hide;

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
    public int getTrainersCapacity() {
        return trainersCapacity;
    }
    public void setTrainersCapacity(int trainersCapacity) {
        this.trainersCapacity = trainersCapacity;
    }
    public int getNutritionistsCapacity() {
        return nutritionistsCapacity;
    }
    public void setNutritionistsCapacity(int nutritionistsCapacity) {
        this.nutritionistsCapacity = nutritionistsCapacity;
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
    public boolean isHide() {
        return hide;
    }
    public void setHide(boolean hide) {
        this.hide = hide;
    }
}
