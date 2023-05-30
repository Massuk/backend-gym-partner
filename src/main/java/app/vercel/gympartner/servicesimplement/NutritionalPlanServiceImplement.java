package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.NutritionalPlan;
import app.vercel.gympartner.repositories.iNutritionalPlanRepository;
import app.vercel.gympartner.services.iNutritionalPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionalPlanServiceImplement implements iNutritionalPlanService {
    @Autowired
    private iNutritionalPlanRepository npR;
    @Override
    public void  insert (NutritionalPlan nutritionalPlan){
        npR.save(nutritionalPlan);
    }
    @Override
    public List<NutritionalPlan> list(){
        return npR.findAll();
    }
    @Override
    public void delete(int idNutritionalPlan){
        npR.deleteById(idNutritionalPlan);
    }
    @Override
    public NutritionalPlan listId(int idNutritionalPlan){
        return npR.findById(idNutritionalPlan).orElse(new NutritionalPlan());
    }
}
