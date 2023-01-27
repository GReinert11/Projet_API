package fr.ul.miage.ProjetAPI.boundary;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.ul.miage.ProjetAPI.entity.*;

public interface OrganisationRepository extends JpaRepository<Organisation, Integer> {
    
}
