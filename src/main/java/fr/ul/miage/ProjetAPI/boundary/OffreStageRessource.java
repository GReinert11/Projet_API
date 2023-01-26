package fr.ul.miage.ProjetAPI.boundary;

import java.util.List;

import fr.ul.miage.ProjetAPI.entity.OffreStage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreStageRessource extends JpaRepository<OffreStage, String>{
    List<OffreStage> findByNom(String nom);
}
