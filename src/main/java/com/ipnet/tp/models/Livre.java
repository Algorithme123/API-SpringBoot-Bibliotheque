package com.ipnet.tp.models;

import javax.persistence.*;


@Entity
@Table(name="Livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="nom", nullable = false)
    private String nom;

    @Column(name="auteur", nullable = false, unique = false)
    private String auteur;

    @Column(name="image", nullable = true)
    private String image;

    @Column(name="categorie", nullable = true)
    private String categorie;

    @Column(name="pdf", nullable = true)
    private String pdf;

    @Column(name="prix", nullable = true)
    private Double prix;

    @Column(name="description", nullable = true)
    private String description;

    public Livre() {
    }

    public Livre(Long id, String nom, String auteur, String image, String categorie, String pdf, Double prix, String description) {
        this.id = id;
        this.nom = nom;
        this.auteur = auteur;
        this.image = image;
        this.categorie = categorie;
        this.pdf = pdf;
        this.prix = prix;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
