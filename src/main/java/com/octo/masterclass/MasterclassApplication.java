package com.octo.masterclass;

import com.octo.masterclass.persistence.Ingredient;
import com.octo.masterclass.persistence.IngredientRepository;
import com.octo.masterclass.persistence.Plat;
import com.octo.masterclass.persistence.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MasterclassApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(MasterclassApplication.class, args);

	}

	@Autowired
	PlatRepository platRepository;
	@Autowired
	IngredientRepository ingredientRepository;

	@Override
	public void run(String... args) throws Exception {
		// init some Ingredients
		Ingredient steak = new Ingredient("Steak", false, 0, true);
		Ingredient poulet = new Ingredient("Poulet", false, 0, true);
		Ingredient pain = new Ingredient("Pain", false, 0, true);
		Ingredient tortilla = new Ingredient("Tortilla", false, 0, true);
		Ingredient salade = new Ingredient("Salade", false, 0, true);
		Ingredient sauce = new Ingredient("Sauce", false, 0, true);
		Ingredient piment = new Ingredient("Piment", false, 4, true);
		Ingredient fromage = new Ingredient("Fromage", true, 0, true);
		Ingredient bacon = new Ingredient("Bacon", false, 0, true);
		Ingredient pommeDeTerre = new Ingredient("Pomme de terre", false, 0, true);
		Ingredient cocaCola = new Ingredient("Coca cola", false, 0, true);
		// Init some Plats
		Plat bigMac = new Plat("Big mac", 5.4, List.of(steak, pain, salade, sauce), 10, true);
		Plat cheeseBurger = new Plat("Cheeseburger", 4.6, List.of(steak, pain, sauce, fromage), 10, true);
		Plat chickenWrap = new Plat("Chicken wrap", 6.0, List.of(poulet, tortilla, sauce, salade), 10, true);
		Plat grandeFrite = new Plat("Grande frite", 4.7, List.of(pommeDeTerre), 5, true);
		Plat moyenneFrite = new Plat("Moyenne frite", 4.2, List.of(pommeDeTerre), 5, true);
		Plat petiteFrite = new Plat("Petite frite", 3.2, List.of(pommeDeTerre), 5, true);
		Plat grandeBoisson = new Plat("Grande boisson", 4.7, List.of(cocaCola), 1, true);
		Plat moyenneBoisson = new Plat("Moyenne boisson", 4.2, List.of(cocaCola), 1, true);
		Plat petiteBoisson = new Plat("Petite boisson", 3.2, List.of(cocaCola), 1, true);

		ingredientRepository.saveAll(List.of(steak, poulet, pain, tortilla, salade, sauce, piment, fromage, bacon, pommeDeTerre, cocaCola));
		platRepository.saveAll(List.of(bigMac, cheeseBurger, chickenWrap,grandeFrite, moyenneFrite, petiteFrite, grandeBoisson, moyenneBoisson, petiteBoisson));
	}
}
