package app.vercel.gympartner.entities;

import javax.persistence.*;

@Entity
@Table(name = "memberships")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembership;
    @Column(name = "name", length = 30, nullable = false)
    private String name;
    @Column(name = "trainerCapacity", nullable = false)
    private int trainerCapacity;
    @Column(name = "nutriCapacity", nullable = false)
    private int nutriCapacity;
    @Column(name = "clientsCapacity", nullable = false)
    private int clientsCapacity;
    @Column(name = "price", nullable = false)
    private float price;

    public Membership() {
    }

    public Membership(int idMembership, String name, int trainerCapacity, int nutriCapacity, int clientsCapacity, float price) {
        this.idMembership = idMembership;
        this.name = name;
        this.trainerCapacity = trainerCapacity;
        this.nutriCapacity = nutriCapacity;
        this.clientsCapacity = clientsCapacity;
        this.price = price;
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
