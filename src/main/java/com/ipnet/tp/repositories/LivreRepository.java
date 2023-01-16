package com.ipnet.tp.repositories;

import com.ipnet.tp.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {

    List<Livre> findByNom(String nom);
}