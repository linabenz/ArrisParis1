package com.projet.arrisparis.dao;

import com.projet.arrisparis.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande, Long> {

}
