package com.projet.arrisparis.model;

import javax.persistence.*;

@Entity
public class Checkout {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    String id_commande;
    String paiement;
    Long user_id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Produit")
    Produits produits;
    int qty;
    double prix;
    @Column(updatable = false, insertable = false)
    String dte_commande;

    public Checkout() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_commande() {
        return id_commande;
    }

    public void setId_commande(String id_commande) {
        this.id_commande = id_commande;
    }

    public String getPaiement() {
        return paiement;
    }

    public void setPaiement(String paiement) {
        this.paiement = paiement;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Produits getProduits() {
        return produits;
    }

    public void setProduits(Produits produits) {
        this.produits = produits;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDte_commande() {
        return dte_commande;
    }

    public void setDte_commande(String dte_commande) {
        this.dte_commande = dte_commande;
    }
}
