package com.octo.masterclass.persistence;

import jakarta.persistence.*;

@Entity
public class Ingredient {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        Long id;
        @Column
        String nom;
        @Column
        boolean allergene;
        @Column
        int kipik;
        @Column
        boolean enStock;

        public Ingredient() {
        }

        public Ingredient(String nom, boolean allergene, int kipik, boolean enStock) {
                this.nom = nom;
                this.allergene = allergene;
                this.kipik = kipik;
                this.enStock = enStock;
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

        public boolean isAllergene() {
                return allergene;
        }

        public void setAllergene(boolean allergene) {
                this.allergene = allergene;
        }

        public int getKipik() {
                return kipik;
        }

        public void setKipik(int kipik) {
                this.kipik = kipik;
        }

        public boolean isEnStock() {
                return enStock;
        }

        public void setEnStock(boolean enStock) {
                this.enStock = enStock;
        }
}
