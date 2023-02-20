package fr.ul.miage.ProjetAPI.boundary.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.ul.miage.ProjetAPI.entity.OffreStage;
import fr.ul.miage.ProjetAPI.entity.Users;
import fr.ul.miage.ProjetAPI.entity.Organisation;
import fr.ul.miage.ProjetAPI.boundary.OrganisationRepository;
import fr.ul.miage.ProjetAPI.boundary.UserRepository;
import fr.ul.miage.ProjetAPI.boundary.OffreStageRepository;

@Configuration
public class DatabaseLoader {
    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Bean
    CommandLineRunner initDatabase(OffreStageRepository repository, UserRepository repositoryUser, OrganisationRepository repositoryOrga) {

        return args -> {
            log.info(
                "Preloading info in database" + repositoryUser.save(new Users(
                    "User1"
                ))
            );
            log.info(
                "Preloading info in database" + repositoryOrga.save(new Organisation(
                    "Entreprise1",
                    "1 rue du Test",
                    "France"
                ))
            );
            log.info(
                "Preloading info in database" + repository.save(new OffreStage(
                    "test",
                    "test",
                    "test",
                    java.sql.Date.valueOf("2021-01-01"),
                    "test",
                    "test",
                    java.sql.Date.valueOf("2021-01-01"),
                    "test",
                    1500,
                    "test",
                    1,
                    "test",
                    "test",
                    75000,
                    "test",
                    0.0,
                    0.0,
                    "test",
                    "test",
                    "test",
                    "test",
                    54000,
                    "test",
                    "test",
                    "test",
                    "Oui"
                ))
            );
            repository.save(new OffreStage(
                "Offre1",
                "Informatique",
                "Développeur Java",
                java.sql.Date.valueOf("2022-01-01"),
                "Bac+3",
                "Aucune",
                java.sql.Date.valueOf("2021-01-01"),
                "3mois",
                2000,
                "Aucune",
                1,
                "test2",
                "test2",
                75000,
                "test2",
                0.0,
                0.0,
                "test2",
                "test2",
                "test2",
                "test2",
                54000,
                "test2",
                "test2",
                "test2",
                "Oui"
            ));


        };
    }

}
