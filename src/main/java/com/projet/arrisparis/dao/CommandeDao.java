package com.projet.arrisparis.dao;

import com.projet.arrisparis.model.Commande;
import com.projet.arrisparis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommandeDao extends JpaRepository<Commande, Long> {

}
