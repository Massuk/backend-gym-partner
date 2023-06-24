package app.vercel.gympartner.config;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.vercel.gympartner.entities.Role;
import app.vercel.gympartner.repositories.IRoleRepository;
@Component
public class DataInitializer {

    private final IRoleRepository roleRepository;

    @Autowired
    public DataInitializer(IRoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void initializeData() {
        // Verificar si ya existen registros en la base de datos
        if (roleRepository.count() == 0) {
            // Crear registros de ejemplo
            Role adminRole = new Role();
            adminRole.setName("ADMINISTRADOR");

            Role nutritionistRole = new Role();
            nutritionistRole.setName("NUTRICIONISTA");

            Role trainerRole = new Role();
            trainerRole.setName("ENTRENADOR");

            // Guardar los roles en la base de datos
            roleRepository.save(adminRole);
            roleRepository.save(nutritionistRole);
            roleRepository.save(trainerRole);
        }
    }
}
