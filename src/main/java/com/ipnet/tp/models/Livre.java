package com.ipnet.tp.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="isbnn", nullable = false)
    private String isbnn;

    @Column(name="format", nullable = false, unique = false)
    private String format;

    @Column(name="image", nullable = true)
    private String image;

    @Column(name="titre",nullable = false)
    private String titre;

    @Column(name="sous_titre", nullable =false)
    private String sousTitre;

    @Column(name="description")
    private String description;

    @Column(name="langue", nullable = false)
    private String langue;

    @Column(name="quantite", nullable = false)
    private Integer quantite;

    @Column(name="date_mis_en_vente", nullable = false)
    private Date dateMisEnVente;

    @Column(name ="date_publication", nullable = false)
    private  Date datePublication;

    @Column(name="editeur" , nullable = true)
    private String editeur;

    @Column(name="nombre_de_page", nullable = false)
    private  Integer nombreDePage;

    @Column(name="nom_de_la_serie", nullable = true)
    private String nomDeLaSerie;

    @Column(name = "autorisation_parentale")
    private Boolean autorisationParentale;

    @Column(name="genre" , nullable = false)
    private  String genre;

    @Column(name = "contributeurs", nullable = true)
    private String contributeurs;


    public Livre() {
    }

    public Livre(Long id, String isbnn, String format, String image,
                 String titre, String sousTitre, String description,
                 String langue, Integer quantite, Date dateMisEnVente,
                 Date datePublication, String editeur, Integer nombreDePage,
                 String nomDeLaSerie, Boolean autorisationParentale, String genre,
                 String contributeurs) {
        this.id = id;
        this.isbnn = isbnn;
        this.format = format;
        this.image = image;
        this.titre = titre;
        this.sousTitre = sousTitre;
        this.description = description;
        this.langue = langue;
        this.quantite = quantite;
        this.dateMisEnVente = dateMisEnVente;
        this.datePublication = datePublication;
        this.editeur = editeur;
        this.nombreDePage = nombreDePage;
        this.nomDeLaSerie = nomDeLaSerie;
        this.autorisationParentale = autorisationParentale;
        this.genre = genre;
        this.contributeurs = contributeurs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbnn() {
        return isbnn;
    }

    public void setIsbnn(String isbnn) {
        this.isbnn = isbnn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Date getDateMisEnVente() {
        return dateMisEnVente;
    }

    public void setDateMisEnVente(Date dateMisEnVente) {
        this.dateMisEnVente = dateMisEnVente;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public Integer getNombreDePage() {
        return nombreDePage;
    }

    public void setNombreDePage(Integer nombreDePage) {
        this.nombreDePage = nombreDePage;
    }

    public String getNomDeLaSerie() {
        return nomDeLaSerie;
    }

    public void setNomDeLaSerie(String nomDeLaSerie) {
        this.nomDeLaSerie = nomDeLaSerie;
    }

    public Boolean getAutorisationParentale() {
        return autorisationParentale;
    }

    public void setAutorisationParentale(Boolean autorisationParentale) {
        this.autorisationParentale = autorisationParentale;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getContributeurs() {
        return contributeurs;
    }

    public void setContributeurs(String contributeurs) {
        this.contributeurs = contributeurs;
    }


    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", ISBNN='" + isbnn + '\'' +
                ", format='" + format + '\'' +
                ", image='" + image + '\'' +
                ", titre='" + titre + '\'' +
                ", sousTitre='" + sousTitre + '\'' +
                ", description='" + description + '\'' +
                ", langue='" + langue + '\'' +
                ", quantite='" + quantite + '\'' +
                ", dateMisEnVente=" + dateMisEnVente +
                ", datePublication=" + datePublication +
                ", editeur='" + editeur + '\'' +
                ", nombreDePage=" + nombreDePage +
                ", nomDeLaSerie='" + nomDeLaSerie + '\'' +
                ", autorisationParentale=" + autorisationParentale +
                ", genre='" + genre + '\'' +
                ", contributeurs='" + contributeurs + '\'' +
                '}';
    }
}
