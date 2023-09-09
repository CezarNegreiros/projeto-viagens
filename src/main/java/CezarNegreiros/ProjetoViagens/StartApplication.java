package CezarNegreiros.ProjetoViagens;

import CezarNegreiros.ProjetoViagens.model.User;
import CezarNegreiros.ProjetoViagens.repositories.UserRepository;
import CezarNegreiros.ProjetoViagens.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setId(1);
        user.setName("Cezar");
        user.setUsername("CezarNegreiros");
        user.setPassword("Spring123");
        user.setRoles(null);

        User user2 = new User();
        user2.setId(2);
        user2.setName("Miguel");
        user2.setUsername("MiguelNascimento");
        user2.setPassword("Roblox456");
        user2.setRoles(null);

        repository.saveAll(Arrays.asList(user, user2));

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
