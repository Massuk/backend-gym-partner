package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "memberships")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembership;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "trainersCapacity", nullable = false)
    private int trainersCapacity;
    @Column(name = "nutritionistsCapacity", nullable = false)
    private int nutritionistsCapacity;
    @Column(name = "clientsCapacity", nullable = false)
    private int clientsCapacity;
    @Column(name = "price", nullable = false)
    private float price;
    @Column(name = "hide", nullable = false)
    private boolean hide;

    public Membership() {
    }
    public Membership(int idMembership, String name, int trainersCapacity, int nutritionistsCapacity, int clientsCapacity, float price, boolean hide) {
        this.idMembership = idMembership;
        this.name = name;
        this.trainersCapacity = trainersCapacity;
        this.nutritionistsCapacity = nutritionistsCapacity;
        this.clientsCapacity = clientsCapacity;
        this.price = price;
        this.hide = hide;
    }

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
