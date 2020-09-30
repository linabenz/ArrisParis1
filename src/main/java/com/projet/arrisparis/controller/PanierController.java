

package com.projet.arrisparis.controller;
import com.projet.arrisparis.dao.CommandeDao;
import com.projet.arrisparis.dao.ProduitsDAO;
import com.projet.arrisparis.model.*;
import com.projet.arrisparis.repository.UserRepository;
import com.projet.arrisparis.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/panier")
public class PanierController {

    @Autowired
    CartService cartManager;
    @Autowired
    private CommandeDao commandeDao;
    @Autowired
    private ProduitsDAO produitsDAO;
    @Autowired
    UserRepository userRepository;


    @RequestMapping("")
    public String add(HttpSession session, @RequestParam("id") Produits product,
                      @RequestParam(value = "qty", required = false, defaultValue = "1") int qty){
        Panier cart = cartManager.getPanier(session);
        cart.addItem(product, qty);
        return "panier";
    }

    @RequestMapping("/remove")
    public String remove(HttpSession session, @RequestParam("id") Produits product){
        Panier cart = cartManager.getPanier(session);
        cart.removeItem(product);
        return "panier";
    }

    @RequestMapping("/update")
    public String update(HttpSession session, @RequestParam("id") Produits product, @RequestParam("qty") int qty){
        Panier cart = cartManager.getPanier(session);
        cart.updateItem(product, qty);

        return "panier";
    }

    @RequestMapping("/validation")
    public String validation(HttpSession session, Authentication authentication, @RequestParam("id") Produits product){
        Commande commande = new Commande();
        Panier cart = cartManager.getPanier(session);
        commande.setTotal(cart.getTotal());
       if(authentication != null){
            User user = userRepository.findByEmail(authentication.getName());
            commande.setUser(user);
        }

        //commande.getProduits(cart.getItem(produits));
        commandeDao.save(commande);
        //List<Item> items = cartManager.getPanier(session).getItems();



        return "panier";
    }
}

/*  @Autowired
    ProduitsService produitsService;*//*


    @Autowired
    ProduitsDAO produitsDAO;

    @Autowired
    UserRepository userRepository;


    */
/**
     * Méthode qui va permettre d'afficher les produits de la commande et de récuperer les informations liée au user.
     *//*


        */
/*@Autowired
        private CartService cartManager;

        @RequestMapping("/decoupe")
        public String add(HttpSession session, @RequestParam("id") Produits product,
                          @RequestParam(value = "qty", required = false, defaultValue = "1") int qty){
            Panier cart = cartManager.getPanier(session);
            cart.addItem(product, qty);
            return "panier2";
        }

        @RequestMapping("/remove")
        public String remove(HttpSession session, @RequestParam("id") Produits product){
            Panier cart = cartManager.getPanier(session);
            cart.removeItem(product);
            return "panier2";
        }

        @RequestMapping("/update")
        public String update(HttpSession session, @RequestParam("id") Produits product, @RequestParam("qty") int qty){
            Panier cart = cartManager.getPanier(session);
            cart.updateItem(product, qty);
            return "panier2";
        }
*//*

    @RequestMapping(value = "/panier", method = RequestMethod.GET)
    public String affichageProduit( Model model) {
        //Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //String username = authentication.getName();
        //User user = userRepository.findByEmail(username);
        //model.addAttribute("produits", produitsDAO.findProduitsByUserEmail(username));

        //model.addAttribute("user", user);
        return "panier";
    }

*/
/**
     * Méthode qui va permettre la suppression d'un Produits
     *//*



    */
/*@RequestMapping(value = "/delete/{id_Produit}", method = RequestMethod.GET)
    public String supprimerProduit(@PathVariable("id_Produit") Long id, Model model){
        model.addAttribute("produits", new Produits());
        produitsDAO.deleteById(id);
        return "panier";
    }*//*


    */
/**
     * Méthode qui va permettre de modifier la quantité
     *//*


    */
/*@RequestMapping(value="/update/{id_Produit}", method = RequestMethod.GET)
    public String modifierQte(@PathVariable("id_Produit") Long id,Model model, RedirectAttributes redirectAttrs ){
        Produits produits = produitsDAO.findById(id).get();
        int qty = produits.getQuantity();
        produits.setQuantity(qty);
        produitsDAO.save(produits);
        redirectAttrs.addAttribute("id",id);
        return "panier";

    }*//*


    */
/**
     * Méthode qui va permettre de calculer le prix total de la commande
     *//*

    */
/*@GetMapping("/panier")
    public String infoClient(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("user", userRepository.findByEmail(username));
        return "panier";
    }*//*


    */
/**
     * Méthode qui va permettre de calculer le prix total de la commande
     *//*



    */
/**
     * Méthode qui va permettre de valider la commande
     *//*
*/
/*
*//*

*/
/* A finir

    @RequestMapping(value="afficheCommande", method = RequestMethod.GET)
    public String validationCommande(Produits produits, Model model){
        Commandes commandes = new Commandes();

        return "afficheCommande";
    }*//*


}

*/
