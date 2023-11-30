package com.octo.masterclass.api;

import com.octo.masterclass.restaurant.Formule;
import com.octo.masterclass.restaurant.Ingredient;
import com.octo.masterclass.restaurant.Plat;
import com.octo.masterclass.restaurant.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/formule")
public class FormuleController {

    // init some Ingredients
    Ingredient steak = new Ingredient("Steak", false, 0, true);
    Ingredient poulet = new Ingredient("Poulet", false, 0, true);
    Ingredient pain = new Ingredient("Pain", false, 0, true);
    Ingredient tortilla = new Ingredient("Tortilla", false, 0, true);
    Ingredient salade = new Ingredient("Salade", false, 0, true);
    Ingredient sauce = new Ingredient("Sauce", false, 0, true);
    Ingredient fromage = new Ingredient("Fromage", false, 0, true);
    Ingredient bacon = new Ingredient("Bacon", false, 0, true);
    Ingredient pommeDeTerre = new Ingredient("Pomme de terre", false, 0, true);
    Ingredient cocaCola = new Ingredient("Coca cola", false, 0, true);

    // Init some Plats
    Plat bigMac = new Plat("Big mac", 5.4, List.of(
            steak, pain, salade, sauce
    ), 10, true);
    Plat cheeseBurger = new Plat("Cheeseburger", 4.6, List.of(
            steak, pain, sauce, fromage
    ), 10, true);
    Plat chickenWrap = new Plat("Chicken wrap", 6.0, List.of(
            poulet, tortilla, sauce, salade
    ), 10, true);
    Plat grandeFrite = new Plat("Grande frite", 4.7, List.of(pommeDeTerre), 5, true);
    Plat moyenneFrite = new Plat("Moyenne frite", 4.2, List.of(pommeDeTerre), 5, true);
    Plat petiteFrite = new Plat("Petite frite", 3.2, List.of(pommeDeTerre), 5, true);
    Plat grandeBoisson = new Plat("Grande boisson", 4.7, List.of(cocaCola), 1, true);
    Plat moyenneBoisson = new Plat("Moyenne boisson", 4.2, List.of(cocaCola), 1, true);
    Plat petiteBoisson = new Plat("Petite boisson", 3.2, List.of(cocaCola), 1, true);


    // Init some Formules
    Formule bestOf = new Formule("bestOf", List.of(
            bigMac, moyenneFrite, moyenneBoisson
    ));
    Formule maxiBestOf = new Formule("maxiBestOf", List.of(
            chickenWrap, grandeFrite, grandeBoisson
    ));
    Formule petiteFaim = new Formule("petiteFaim", List.of(
            cheeseBurger, petiteFrite, petiteBoisson
    ));

    List<Formule> carte = List.of(petiteFaim, bestOf, maxiBestOf);

    private RestaurantService service;

    public FormuleController(RestaurantService service) {
        this.service = service;
    }

    // quand je fais get sur API /formule => je renvoi les formules
    @GetMapping
    List<Formule> getFormules() {
        return carte;
    }

    @GetMapping("/prix")
    Double getPrixBestOf() {
        return service.calculerPrixFormule(bestOf);
    }

    @GetMapping("/temps")
    Integer getTempsDePreparation() {
        return service.calculerTempsDePreparation(bestOf);
    }

}
