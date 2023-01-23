package fr.ul.miage.ProjetAPI.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor 

public class OffreStage {

    @Id
    private String id;
    private String nom;
    private String domaine;
    private String nomOrganisation;
    private String descriptionStage;
    private Date datePublication;
    private String niveauEtudesStage;
    private String experienceRequiseStage;
    private Date dateDebutStage;
    private String dureeStage;
    private int salaireStage;
    private String indemnisation;

    
    
}
