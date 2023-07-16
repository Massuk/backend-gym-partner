package app.vercel.gympartner.dtos;

public class ClientsByNutritionistDTO {
    private String name;
    private int clientCount;

    public ClientsByNutritionistDTO() {
    }

    public ClientsByNutritionistDTO(String name, int clientCount) {
        this.name = name;
        this.clientCount = clientCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientCount() {
        return clientCount;
    }

    public void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }
}
