package com.ipnet.tp.repositories;


import com.ipnet.tp.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository  extends JpaRepository<Livre, Long> {


    public Livre<Livre> findByTitreETIsbn(String titre,String isbn);
}
