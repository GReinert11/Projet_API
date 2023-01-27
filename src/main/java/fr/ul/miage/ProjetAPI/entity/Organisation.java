package fr.ul.miage.ProjetAPI.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Organisation implements Serializable{
    
    private @Id @GeneratedValue int id;
    private String nomOrganisation;
    private String pays;
    private String ville;
    private int codePostal;
    private String rue;
    private String email;
    private String telephone;
    private String url;

    public Organisation(String nomOrganisation, String pays, String ville, int codePostal, String rue, String email, String telephone, String url){
        this.nomOrganisation = nomOrganisation;
        this.pays = pays;
        this.ville = ville;
        this.codePostal = codePostal;
        this.rue = rue;
        this.email = email;
        this.telephone = telephone;
        this.url = url;
    }
}
