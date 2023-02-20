package fr.ul.miage.ProjetAPI.boundary;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ul.miage.ProjetAPI.entity.Candidature;

public interface CandidatureRepository extends JpaRepository<Candidature,Integer>{
    
}
