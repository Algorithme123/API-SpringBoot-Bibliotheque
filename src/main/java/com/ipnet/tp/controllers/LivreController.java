package com.ipnet.tp.controllers;

import com.ipnet.tp.models.Livre;
import com.ipnet.tp.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/livre")
@RestController
public class LivreController {

    @Autowired
    public LivreService livreService;

    //Ajout d'un livre

    @RequestMapping(value = "/ajout",method = RequestMethod.POST,headers = "accept=Application/json")
    public Livre save(@RequestBody Livre livre ){

        try {
            livre = livreService.save(livre);

        }catch (Exception e){
            System.out.println(e);
            System.out.println("Erreur");
        }
    return  livre;

    }

    // Modification d'un livre
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.PUT,headers = "Accept=Application/json")
    public Livre updateLivre(@RequestBody Livre livre){
        try {
            livre = livreService.updateLivre(livre);
        }catch (Exception e){
            System.out.print(e);
        }
        return  livre;
    }


    //Suppression d'une occurrence par la clé primaire ;
    @RequestMapping(value = "supp/{id}",method = RequestMethod.DELETE)
    public String deleteSuppLivreParId( @PathVariable Long id){
        try{
            livreService.deleteParId(id);
        }catch(Exception e){
            System.out.print(e);
        }
        return  "Livre Supprimer";

    }


//Suppression d'une occurrence par l'objet entier ;
    @RequestMapping(value = "supprimer/", method = RequestMethod.DELETE)
    public void deleteLivreParObjet(Livre livre){
        try {
            livreService.deleteParObjet(livre);
        }catch (Exception e){
            System.out.print(e);
        }

    }


   // Affichage de toutes les occurrences ;
    @RequestMapping(value = "/liste",method = RequestMethod.GET,headers = "Accept=Application/json")
    public List<Livre> getAll(){
        List<Livre> livres = new ArrayList<>();

        try{
            livres =  livreService.getAllLivres();
        }catch (Exception e){
            System.out.print(e);
        }
        return  livres;

    }

    //Recherche d'une occurrence par la clé primaire ;
    @RequestMapping(value="/{id}",method = RequestMethod.GET,headers = "Accept=Application/json")
    public Optional<Livre> getLivreByID(@PathVariable Long id){
        return  livreService.findParId(id);

    }

    //Recherche d'une occurrence au moins par un autre attribut de l'entité ;
    @RequestMapping(value="/recherche", method=RequestMethod.GET,headers = "Accept=Application/json")
    public Livre findParTitreOuIsbn( String isbnn){
        List<Livre> livres = new ArrayList<>();

        try {
            livres = (List<Livre>) livreService.findByIsbnn(isbnn);
        }catch (Exception e){
            System.out.println(e);
        }
        return (Livre) livres;
    }








}
