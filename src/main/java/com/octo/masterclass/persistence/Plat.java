package com.octo.masterclass.persistence;

import jakarta.persistence.*;

import java.util.List;

//https://spring.io/guides/gs/accessing-data-mysql/

@Entity
public class Plat {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        Long id;
        @Column
        String nom;
        @Column
        Double prix;
        @Column
        int tempsPreparation;
        @Column
        boolean takeAway;
        @OneToMany //(mappedBy = "ingredient", cascade = CascadeType.PERSIST)
        @JoinColumn(name="PLAT_ID")
        List<Ingredient> ingredients;

        public Plat() {
        }

        public Plat(String nom, Double prix, List<Ingredient> ingredients, int tempsPreparation, boolean takeAway) {
                this.nom = nom;
                this.prix = prix;
                this.ingredients = ingredients;
                this.tempsPreparation = tempsPreparation;
                this.takeAway = takeAway;

        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
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

        public int getTempsPreparation() {
                return tempsPreparation;
        }

        public void setTempsPreparation(int tempsPreparation) {
                this.tempsPreparation = tempsPreparation;
        }

        public boolean isTakeAway() {
                return takeAway;
        }

        public void setTakeAway(boolean takeAway) {
                this.takeAway = takeAway;
        }

        public List<Ingredient> getIngredients() {
                return ingredients;
        }

        public void setIngredients(List<Ingredient> ingredients) {
                this.ingredients = ingredients;
        }
}
