package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.dtos.NutritionistsByGymDTO;
import app.vercel.gympartner.dtos.TrainersByGymDTO;
import app.vercel.gympartner.entities.Gym;
import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.IGymRepository;
import app.vercel.gympartner.repositories.IUserRepository;
import app.vercel.gympartner.services.IGymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GymServiceImplement implements IGymService {

    @Autowired
    private IGymRepository gR;
    @Autowired
    private IUserRepository uR;
    @Override
    public void insert(Gym gym) {
        gR.save(gym);
    }
    @Override
    public List<Gym> list() {
        return gR.findAll();
    }
    @Override
    public Gym listId(int idGym) {
        return gR.findById(idGym).orElse(new Gym());
    }
    @Override
    public void hideGym(int id) {
        gR.hideGym(id);
    }
    @Override
    public Gym listGymByUsername(String username) {
        return gR.listGymByUsername(username);
    }

    @Override
    public List<TrainersByGymDTO> trainersGym(int id) {
        List<String[]> trainersCountByGym = gR.getTrainersByGym(id);
        List<TrainersByGymDTO> trainersByGymDTOs = new ArrayList<>();

        for (String[] data: trainersCountByGym) {
            TrainersByGymDTO dto = new TrainersByGymDTO();
            dto.setName(data[0]);
            dto.setTrainerCount(Integer.parseInt(data[1]));
            trainersByGymDTOs.add(dto);
        }
        return trainersByGymDTOs;
    }

    @Override
    public List<NutritionistsByGymDTO> nutritionistsGym(int id) {
        List<String[]> nutritionistsCountByGym = gR.getNutritionistsByGym(id);
        List<NutritionistsByGymDTO> nutritionistsByGymDTOs = new ArrayList<>();

        for (String[] data: nutritionistsCountByGym) {
            NutritionistsByGymDTO dto = new NutritionistsByGymDTO();
            dto.setName(data[0]);
            dto.setNutritionistCount(Integer.parseInt(data[1]));
            nutritionistsByGymDTOs.add(dto);
        }
        return nutritionistsByGymDTOs;
    }

    @Override
    public List<TrainersByGymDTO> trainersAllGyms() {
        List<String[]> trainersCountByGym = gR.getTrainerCountByGym();
        List<TrainersByGymDTO> trainersByGymDTOs = new ArrayList<>();

        for (String[] data: trainersCountByGym) {
            TrainersByGymDTO dto = new TrainersByGymDTO();
            dto.setName(data[0]);
            dto.setTrainerCount(Integer.parseInt(data[1]));
            trainersByGymDTOs.add(dto);
        }
        return trainersByGymDTOs;
    }

    @Override
    public List<NutritionistsByGymDTO> nutritionistsAllGyms() {
        List<String[]> nutritionistsCountByGym = gR.getNutritionistCountByGym();
        List<NutritionistsByGymDTO> nutritionistsByGymDTOs = new ArrayList<>();

        for (String[] data: nutritionistsCountByGym) {
            NutritionistsByGymDTO dto = new NutritionistsByGymDTO();
            dto.setName(data[0]);
            dto.setNutritionistCount(Integer.parseInt(data[1]));
            nutritionistsByGymDTOs.add(dto);
        }
        return nutritionistsByGymDTOs;
    }

}
