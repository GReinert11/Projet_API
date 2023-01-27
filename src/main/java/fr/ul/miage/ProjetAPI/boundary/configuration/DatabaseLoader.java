package fr.ul.miage.ProjetAPI.boundary.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.ul.miage.ProjetAPI.entity.OffreStage;
import fr.ul.miage.ProjetAPI.entity.Organisation;
import fr.ul.miage.ProjetAPI.boundary.OffreStageRepository;
import fr.ul.miage.ProjetAPI.boundary.OrganisationRepository;

@Configuration
public class DatabaseLoader {
    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Bean
    CommandLineRunner initDatabase(OffreStageRepository repository, OrganisationRepository repository2) {

        return args -> {
            log.info(
                "Preloading info in database" + repository2.save(new Organisation(
                    "test",
                    "test",
                    "test",
                    75000,
                    "test",
                    "test",
                    "test",
                    "test"
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
                    "test"
                ))
            );
        };
    }

}
