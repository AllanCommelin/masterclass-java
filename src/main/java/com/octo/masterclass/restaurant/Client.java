package com.octo.masterclass.restaurant;

import java.util.List;
import java.util.Objects;

public class Client {
    String nom;
    String prenom;
    String adresse;
    List<Objects> panier;
    Commande commandeEnCours;
    Commande commandePlanifier;
    List<Commande> historiqueCommandes;

    public Client(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Objects> getPanier() {
        return panier;
    }

    public void setPanier(List<Objects> panier) {
        this.panier = panier;
    }

    public Commande getCommandeEnCours() {
        return commandeEnCours;
    }

    public void setCommandeEnCours(Commande commandeEnCours) {
        this.commandeEnCours = commandeEnCours;
    }

    public Commande getCommandePlanifier() {
        return commandePlanifier;
    }

    public void setCommandePlanifier(Commande commandePlanifier) {
        this.commandePlanifier = commandePlanifier;
    }

    public List<Commande> getHistoriqueCommandes() {
        return historiqueCommandes;
    }

    public void setHistoriqueCommandes(List<Commande> historiqueCommandes) {
        this.historiqueCommandes = historiqueCommandes;
    }
}
