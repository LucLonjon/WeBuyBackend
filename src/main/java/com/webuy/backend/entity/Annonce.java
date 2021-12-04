package com.webuy.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Annonce {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String titre;

    private String description;

    private String prix;

    public Annonce(String titre, String description, String prix) {
        this.titre = titre;
        this.description = description;
        this.prix = prix;
    }

    public Annonce() {
        this.titre = null;
        this.description = null;
        this.prix = null;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
