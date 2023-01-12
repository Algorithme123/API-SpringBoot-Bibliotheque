package com.ipnet.tp.controllers;

import com.ipnet.tp.models.Livre;
import com.ipnet.tp.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @PostMapping("/livre")
    public Livre save(@RequestBody Livre livre){
        return livreService.save(livre);
    }

    @GetMapping("/livre/{id}")
    public Optional<Livre> getById(@PathVariable(value = "id") Long id){
        return livreService.find(id);
    }

    @GetMapping("/livre")
    public List<Livre> getAll(){
        return livreService.findAll();
    }

    @DeleteMapping("/livre/{id}")
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
}