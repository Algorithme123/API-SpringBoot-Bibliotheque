package com.ipnet.tp.service;

import com.ipnet.tp.models.Livre;
import com.ipnet.tp.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public Livre save(Livre livre) {

        return livreRepository.save(livre);
    }

    @Override
    public Optional<Livre> find(Long id) {
        return livreRepository.findById(id);
    }

    @Override
    public List<Livre> findAll() {
        return livreRepository.findAll();
    }

    @Override
    public List<Livre> findAll(Sort sort){
        return livreRepository.findAll(sort);
    }

    @Override
    public Page<Livre> findAll(Pageable pageable){
        return livreRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    livreRepository.deleteById(id);
    }

    @Override
    public void delete(Livre livre) {
        livreRepository.delete(livre);
    }

    @Override
    public void deleteAll() {
        livreRepository.deleteAll();
    }

    @Override
    public long count() {
        return livreRepository.count();
    }

}