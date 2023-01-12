package com.ipnet.tp.repositories;

import com.ipnet.tp.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Long> {
}