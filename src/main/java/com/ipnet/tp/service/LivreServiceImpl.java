package com.ipnet.tp.service;

import com.ipnet.tp.models.Livre;
import com.ipnet.tp.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreRepository livreRepository;


    // Ajout d'un livre
    @Override
    public Livre save(Livre livre){
        return livreRepository.save(livre);

    }

    //Modifier un livre
    @Override
    public  Livre updateLivre(Livre livre){
        return livreRepository.save(livre);
    }



    //suppression d'un livre par cle Primaire
    @Override
    public void deleteParId(Long id){
        livreRepository.deleteById(id);
    }

    //suppression par Objet entier
    @Override
    public  void deleteParObjet(Livre livre){
        livreRepository.delete(livre);
    }

    // Affichage de tous les livres
    @Override
    public Livre<Livre> getAllLivres(){
        return (Livre<Livre>) livreRepository.findAll();
    }

    //Recherche d'une occurence par la cle primaire
    @Override
    public Optional<Livre> findParId(Long id){
        return Optional.ofNullable(livreRepository.findById(id).orElse(null));
    }


    //Recherche d'une occurrence au moins par un autre attribut de l'entité ;
    @Override
    public  Livre findParTitreOuIsbn( String titre,String isbn){
       return livreRepository.findByTitreETIsbn(titre,isbn);

    }

    //Affichage du nombre de livre

    @Override
    public Long countNombreDeLivre(){
        return  livreRepository.count();
    }


}
