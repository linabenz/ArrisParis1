package com.projet.arrisparis.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Commandes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Commande;

    private String Paiement;

    @Temporal(TemporalType.DATE)
    private Date dte_Paiement;

    @Temporal(TemporalType.DATE)
    private Date dte_Commande;

    private double ht;
    private double tva;
    private double ttc;
    private String intent;
    private String method;

    @ManyToOne
    User user;



    public Commandes() {
    }

    public Commandes(Long id_Commande, String paiement, Date dte_Paiement, Date dte_Commande, String ht, String tva, String ttc, String intent, String method, User user) {
        this.id_Commande = id_Commande;
        Paiement = paiement;
        this.dte_Paiement = dte_Paiement;
        this.dte_Commande = dte_Commande;
        this.ht = Double.parseDouble(ht);
        this.tva = Double.parseDouble(tva);
        this.ttc = Double.parseDouble(ttc);
        this.method=method;
        this.intent=intent;
        this.user = user;
    }

    public String getHt() { return String.format("%.2f", ht); }

    public String getTva() { return String.format("%.2f", tva); }

    public double getTtc() {
        return ttc;
    }

    public String getIntent() {
        return intent;
    }

    public String getMethod() {
        return method;
    }

    public Long getId_Commande() {
        return id_Commande;
    }

    public void setId_Commande(Long id_Commande) {
        this.id_Commande = id_Commande;
    }

    public String getPaiement() {
        return Paiement;
    }

    public void setPaiement(String paiement) {
        Paiement = paiement;
    }

    public Date getDte_Paiement() {
        return dte_Paiement;
    }

    public void setDte_Paiement(Date dte_Paiement) {
        this.dte_Paiement = dte_Paiement;
    }

    public Date getDte_Commande() {
        return dte_Commande;
    }

    public void setDte_Commande(Date dte_Commande) {
        this.dte_Commande = dte_Commande;
    }



    /*public List<Produits> getProduits() {
        return produits;
    }

    public void setProduits(List<Produits> produits) {
        this.produits = produits;
    }*/
}

 /* @OneToOne
    @JoinColumn(name = "idFacture", nullable = false)
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "idEtatCommande", nullable = false)
    private EtatCommande etatCommande;*/
