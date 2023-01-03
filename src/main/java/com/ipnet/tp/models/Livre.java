package com.ipnet.tp.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="isbn", nullable = false, unique = true)
    private String ISBN;

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
    private String quantite;

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

}
