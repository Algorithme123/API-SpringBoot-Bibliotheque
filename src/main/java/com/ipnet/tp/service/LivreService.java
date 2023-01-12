package com.ipnet.tp.service;

import com.ipnet.tp.models.Livre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface LivreService {

    Livre save(Livre livre);

    Optional<Livre> find(Long id);

    List<Livre> findAll();

    List<Livre> findAll(Sort sort);

    Page<Livre> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Livre livre);

    void deleteAll();

    long count();

}