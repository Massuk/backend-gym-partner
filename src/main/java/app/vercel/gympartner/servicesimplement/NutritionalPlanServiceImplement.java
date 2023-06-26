package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.NutritionalPlan;
import app.vercel.gympartner.repositories.INutritionalPlanRepository;
import app.vercel.gympartner.services.INutritionalPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionalPlanServiceImplement implements INutritionalPlanService {
    @Autowired
    private INutritionalPlanRepository npR;

    @Override
    public List<NutritionalPlan> listNutritionalPlansByIdUser(int idUser) {
        return npR.listNutritionalPlansByIdUser(idUser);
    }

    @Override
    public void  insert (NutritionalPlan nutritionalPlan){
        npR.save(nutritionalPlan);
    }
    @Override
    public NutritionalPlan listId(int idNutritionalPlan){
        return npR.findById(idNutritionalPlan).orElse(new NutritionalPlan());
    }
    @Override
    public void hideNutritionalPlan(int id) {
        npR.hideNutritionalPlan(id);
    }
}