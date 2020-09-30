package com.projet.arrisparis.controller;
import com.projet.arrisparis.dao.ProduitsDAO;
import com.projet.arrisparis.model.Panier;
import com.projet.arrisparis.model.Produits;
import com.projet.arrisparis.repository.UserRepository;
import com.projet.arrisparis.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;



@Controller
public class DecoupeController {

   /* @Autowired
    ProduitsService produitsService;*/

    @Autowired
    ProduitsDAO produitsDAO;

    @Autowired
    UserRepository userRepository;

    @Autowired
    CartService cartManager;


    /**
     *
     *Méthode qui va permettre d'ajouter un produit
     */

    @RequestMapping(value = "/decoupe", method = RequestMethod.GET)
    public String ajouterProduit(Model model){
        Produits produits = new Produits();
        model.addAttribute("produit", produits);
        model.addAttribute("produits", produitsDAO.findAll());
        return "decoupe";
    }

    /**
     * Méthode qui va permettre l'enregistrement du produit choisi par l'utilisateur.
     */

    @RequestMapping(value = "/decoupe", method = RequestMethod.POST)
        public String ajouterProduit(Produits produits) {
            /*Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String username = authentication.getName();
            User user = userRepository.findByEmail(username);*/
            Produits newProduit = new Produits(produits.getNom(), produits.getEpaisseur(), produits.getLongueur(), produits.getLargeur());
            //newProduit.setUser(user);
            produitsDAO.save(newProduit);
            double prix1 = (newProduit.getLargeur()* newProduit.getLongueur()*0.000025f);
            newProduit.setPrix(prix1);
            newProduit.setType("Découpe");
            produitsDAO.save(newProduit);
            //model.addAttribute("user", user);

        return "decoupe";
    }







}
