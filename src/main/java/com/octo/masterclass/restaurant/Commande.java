package com.octo.masterclass.restaurant;

import java.util.List;

public class Commande {
    List<Formule> formules;
    List<Plat> plats;
    Client client;
    Livreur livreur;
    String status;
    Integer tempsAttente;

    public Commande(List<Formule> formules, List<Plat> plats, Client client, Livreur livreur, String status, Integer tempsAttente) {
        this.formules = formules;
        this.plats = plats;
        this.client = client;
        this.livreur = livreur;
        this.status = status;
        this.tempsAttente = tempsAttente;
    }

    public List<Formule> getFormules() {
        return formules;
    }

    public void setFormules(List<Formule> formules) {
        this.formules = formules;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTempsAttente() {
        return tempsAttente;
    }

    public void setTempsAttente(Integer tempsAttente) {
        this.tempsAttente = tempsAttente;
    }
}
