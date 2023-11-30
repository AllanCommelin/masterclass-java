package com.octo.masterclass.api;

import com.octo.masterclass.restaurant.Livreur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/livreur")
public class LivreurController {
    // init some livreurs
    Livreur livreur1 = new Livreur("Pierre", "Thomas");
    Livreur livreur2 = new Livreur("Jefferson", "Jake");
    Livreur livreur3 = new Livreur("Dash", "Bobby");

    @GetMapping
    List<Livreur> getAllLivreurs() { return List.of(livreur1, livreur2, livreur3); }
}
