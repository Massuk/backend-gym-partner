package app.vercel.gympartner.dtos;

import app.vercel.gympartner.entities.Nutritionist;
import app.vercel.gympartner.entities.Trainer;


public class ClientDTO extends UserDTO{
    private Nutritionist nutritionist;
    private Trainer trainer;

    public Nutritionist getNutritionist() {
        return nutritionist;
    }
    public void setNutritionist(Nutritionist nutritionist) {
        this.nutritionist = nutritionist;
    }
    public Trainer getTrainer() {
        return trainer;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
