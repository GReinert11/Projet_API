package fr.ul.miage.ProjetAPI.boundary;

import fr.ul.miage.ProjetAPI.control.OffreStageAssembler;

import org.springframework.stereotype.Controller;

import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value="/Offres", produces=MediaType.APPLICATION_JSON_VALUE)
public class OffreStageRepresentation {

    private final OffreStageAssembler oa;
    private final OffreStageRessource or;

    public OffreStageRepresentation(OffreStageAssembler oa, OffreStageRessource or) {
        this.oa = oa;
        this.or = or;
    }

    @GetMapping
    public ResponseEntity<?> getAllOffres() {
        return ResponseEntity.ok(oa.toCollectionModel(or.findAll()));
    }


    
}
