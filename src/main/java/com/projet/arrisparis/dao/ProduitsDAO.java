package com.projet.arrisparis.dao;

import com.projet.arrisparis.model.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitsDAO extends JpaRepository<Produits,Long> {
    @Override
    List<Produits>findAll();

    @Override
    <S extends Produits> S save(S s);

    List<Produits> findProduitsByUserEmail(String username);


}
