package com.octo.masterclass.restaurant;

public class Livreur {
    String nom;
    String prenom;
    Commande commandePriseEnCharge;

    public Livreur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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

    public Commande getCommandePriseEnCharge() {
        return commandePriseEnCharge;
    }

    public void setCommandePriseEnCharge(Commande commandePriseEnCharge) {
        this.commandePriseEnCharge = commandePriseEnCharge;
    }
}
