package com.octo.masterclass.restaurant;

import java.util.List;

public class Plat {
    String nom;
    Double prix;
    List<Ingredient> ingredients;
    Integer tempsPreparation;
    Boolean takeAway;

    public Plat(String nom, Double prix, List<Ingredient> ingredients, Integer tempsPreparation, Boolean takeAway) {
        this.nom = nom;
        this.prix = prix;
        this.ingredients = ingredients;
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public Boolean getTakeAway() {
        return takeAway;
    }

    public void setTakeAway(Boolean takeAway) {
        this.takeAway = takeAway;
    }

    public Integer getTempsPreparation() {
        return tempsPreparation;
    }

    public void setTempsPreparation(Integer tempsPreparation) {
        this.tempsPreparation = tempsPreparation;
    }
}
