package com.ipnet.tp.service;

import com.ipnet.tp.models.Livre;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LivreService {
    // Ajout d'un livre
    Livre save(Livre livre);

    //Modifier un livre
    Livre updateLivre(Livre livre);

    //suppression d'un livre par cle Primaire
    void deleteParId(Long id);

    //suppression par Objet entier
    void deleteParObjet(Livre livre);

    // Affichage de tous les livres
    List<Livre> getAllLivres();

    //Recherche d'une occurence par la cle primaire
    Optional<Livre> findParId(Long id);

    //Recherche d'une occurrence au moins par un autre attribut de l'entité ;
    Livre findByIsbnn(String titre);

    Long countNombreDeLivre();
}
