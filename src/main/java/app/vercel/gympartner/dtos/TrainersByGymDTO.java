package app.vercel.gympartner.dtos;

public class TrainersByGymDTO {
    private String name;
    private int trainerCount;
    public TrainersByGymDTO() {
    }

    public TrainersByGymDTO(String name, int trainerCount) {
        this.name = name;
        this.trainerCount = trainerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainerCount() {
        return trainerCount;
    }

    public void setTrainerCount(int trainerCount) {
        this.trainerCount = trainerCount;
    }
}
