
package com.projet.arrisparis.controller;

import com.projet.arrisparis.dao.ProduitsDAO;
import com.projet.arrisparis.model.Produits;
import com.projet.arrisparis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PanierController {

    @Autowired
    ProduitsDAO produitsDAO;

    @Autowired
    UserRepository userRepository;


/**
     * Méthode qui va permettre d'afficher les produits de la commande.
     */


    @RequestMapping("/panier")
    public String affichageProduit(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("produits", produitsDAO.findProduitsByUserEmail(username));
        return "panier";
    }


/**
     * Méthode qui va permettre la suppression d'un Produits
     */


    @RequestMapping(value = "/delete/{id_Produit}", method = RequestMethod.GET)
    public String supprimerProduit(@PathVariable("id_Produit") Long id, Model model){
        model.addAttribute("produits", new Produits());
        produitsDAO.deleteById(id);
        return "panier";
    }

    /**
     * Méthode qui va permettre de modifier la quantité
     */

    /*@RequestMapping(value="/update/{id_Produit}", method = RequestMethod.GET)
    public String modifierQte(@PathVariable("id_Produit") Long id,Model model, RedirectAttributes redirectAttrs ){
        Produits produits = produitsDAO.findById(id).get();
        int qty = produits.getQte();
        float prix = qty*produits.getPrix();
        produits.setPrix(prix);
        produitsDAO.save(produits);
        redirectAttrs.addAttribute("id",id);
        return "panier2";

    }*/


    /**
     * Méthode qui va permettre de calculer le prix total de la commande
     */


    /**
     * Méthode qui va permettre de valider la commande
     *//*
*/
/* A finir

    @RequestMapping(value="afficheCommande", method = RequestMethod.GET)
    public String validationCommande(Produits produits, Model model){
        Commandes commandes = new Commandes();

        return "afficheCommande";
    }*/

}

