package app.vercel.gympartner.services;

import app.vercel.gympartner.dtos.NutritionistsByGymDTO;
import app.vercel.gympartner.dtos.TrainersByGymDTO;
import app.vercel.gympartner.entities.Gym;

import java.util.List;

public interface IGymService {
    void insert(Gym gym);
    List<Gym> list();
    Gym listId(int idGym);
    void hideGym(int id);
    Gym listGymByUsername(String username);
    List<TrainersByGymDTO> trainersGym(int id);
    List<NutritionistsByGymDTO> nutritionistsGym(int id);
    List<TrainersByGymDTO> trainersAllGyms();
    List<NutritionistsByGymDTO> nutritionistsAllGyms();
}
