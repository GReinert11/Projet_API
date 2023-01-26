package fr.ul.miage.ProjetAPI.entity;

import java.io.Serial;
import java.io.Serializable;
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

public class OffreStage implements Serializable{
    
    @Serial
    private static final long serialVersionUID = 777;
    @Id
    private String id;
    private String nom;
    private String domaine;
    private String descriptionStage;
    private Date datePublication;
    private String niveauEtudesStage;
    private String experienceRequiseStage;
    private Date dateDebutStage;
    private String dureeStage;
    private int salaireStage;
    private String indemnisation;
    private int organisationId;
    private String pays;
    private String ville;
    private int codePostal;
    private String rue;
    private Double longitude;
    private Double latitude;
    private String telephone;
    private String url;
    
    
}
