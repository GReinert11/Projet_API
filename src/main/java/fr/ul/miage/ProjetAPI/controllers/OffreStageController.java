package fr.ul.miage.ProjetAPI.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ul.miage.ProjetAPI.boundary.*;
import fr.ul.miage.ProjetAPI.entity.OffreStage;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
public class OffreStageController {

    private final OffreStageRepository or;
    private final OffreStageAssembler oa;

    OffreStageController(OffreStageRepository or, OffreStageAssembler oa){
        this.or = or;
        this.oa = oa;
    }

    @GetMapping("/Offres")
    public ResponseEntity<?> getAllOffres(){
        return ResponseEntity.ok(oa.toCollectionModel(or.findAll()));
    }
    
    @GetMapping("/Offres/{id}")
    public ResponseEntity<?> getOffreById(@PathVariable("id") int id){
        return ResponseEntity.ok(oa.toModel(or.findById(id).get()));
    }

    @PostMapping("/Offres")
    @Transactional
    public ResponseEntity<?> save(@RequestBody OffreStage offreStage){
        OffreStage toSave = new OffreStage(
            offreStage.getNom(),
            offreStage.getDomaine(),
            offreStage.getDescriptionStage(),
            offreStage.getDatePublication(),
            offreStage.getNiveauEtudesStage(),
            offreStage.getExperienceRequiseStage(),
            offreStage.getDateDebutStage(),
            offreStage.getDureeStage(),
            offreStage.getSalaireStage(),
            offreStage.getIndemnisation(),
            offreStage.getOrganisationId(),
            offreStage.getPays(),
            offreStage.getVille(),
            offreStage.getCodePostal(),
            offreStage.getRue(),
            offreStage.getLongitude(),
            offreStage.getLatitude(),
            offreStage.getTelephone(),
            offreStage.getUrl()
        );
        OffreStage saved = or.save(toSave);
        URI location = linkTo(OffreStageController.class).slash(saved.getId()).toUri();
        
        return ResponseEntity.created(location).build();
    }
    
}
