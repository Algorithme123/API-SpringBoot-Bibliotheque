package com.ipnet.tp.controllers;

import com.ipnet.tp.models.Livre;
import com.ipnet.tp.repositories.LivreRepository;
import com.ipnet.tp.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*")

public class LivreController {

    @Autowired
    private LivreService livreService;

    @Autowired
    private LivreRepository livreRepository;

    @PostMapping("/livre/add")
    public Livre save(@RequestBody Livre livre){

        return livreService.save(livre);
    }

    @GetMapping("/livre/one/{id}")
    public Optional<Livre> getById(@PathVariable(value = "id") Long id){
        return livreService.find(id);
    }

    @GetMapping("/allLivre")
    public List<Livre> getAll(){
        return livreService.findAll();
    }

    @DeleteMapping("/livre/{id}/delete")
    public void deleteById(@PathVariable(value = "id") Long id){
        livreService.delete(id);
    }

    @DeleteMapping("/livre")
    public void deleteAll(){
        livreService.deleteAll();
    }

    @GetMapping("/livre/count")
    public long count(){
        return livreService.count();
    }

    @GetMapping("/livre/nom")
    public ResponseEntity<List<Livre>> getlivreByNom(@RequestParam String nom) {
        return new ResponseEntity<List<Livre>>(livreRepository.findByNom(nom), HttpStatus.OK);
    }
}