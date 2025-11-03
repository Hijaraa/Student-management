package com.example.studentmanagement.entity;
import  jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

@Entity
@Schema(description = "Entité représentant un étudiant")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Identifiant unique de l'étudiant", example = "1")
    private int id;
    
    @Schema(description = "Nom de famille de l'étudiant", example = "Dupont", required = true)
    private String nom;
    
    @Schema(description = "Prénom de l'étudiant", example = "Jean", required = true)
    private String prenom;

    @Temporal(TemporalType.DATE)
    @Schema(description = "Date de naissance de l'étudiant", example = "2000-05-15")
    private Date dateNaissance;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}