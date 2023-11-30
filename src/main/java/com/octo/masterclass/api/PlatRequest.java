package com.octo.masterclass.api;

import java.util.List;

public class PlatRequest {
    String nom;
    Double prix;
    List<Long> ingredientIds;
    Integer tempsPreparation;
    Boolean takeAway;

    public PlatRequest(String nom, Double prix, List<Long> ingredientIds, Integer tempsPreparation, Boolean takeAway) {
        this.nom = nom;
        this.prix = prix;
        this.ingredientIds = ingredientIds;
        this.tempsPreparation = tempsPreparation;
        this.takeAway = takeAway;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public List<Long> getIngredientIds() {
        return ingredientIds;
    }

    public void setIngredientIds(List<Long> ingredientIds) {
        this.ingredientIds = ingredientIds;
    }

    public Integer getTempsPreparation() {
        return tempsPreparation;
    }

    public void setTempsPreparation(Integer tempsPreparation) {
        this.tempsPreparation = tempsPreparation;
    }

    public Boolean getTakeAway() {
        return takeAway;
    }

    public void setTakeAway(Boolean takeAway) {
        this.takeAway = takeAway;
    }
}
