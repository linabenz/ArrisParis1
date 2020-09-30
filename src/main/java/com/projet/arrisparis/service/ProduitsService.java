package com.projet.arrisparis.service;

import com.projet.arrisparis.model.Produits;

import java.util.List;

public interface ProduitService {

    public List<Produits> findAll();
    public Produits find(long id);

}
