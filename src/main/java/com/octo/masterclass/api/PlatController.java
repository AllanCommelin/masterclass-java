package com.octo.masterclass.api;

import com.octo.masterclass.persistence.Ingredient;
import com.octo.masterclass.persistence.Plat;
import com.octo.masterclass.persistence.PlatRepository;
import com.octo.masterclass.restaurant.IngredientService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plats")
public class PlatController {
    private final PlatRepository repository;
    private IngredientService ingredientService;

    public PlatController(PlatRepository repository, IngredientService ingredientService) {
        this.repository = repository;
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public Iterable<Plat> listerPlats() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Plat> getPlat(@PathVariable("id") String idStr) {
        long id = Long.parseLong(idStr);
        return repository.findById(id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlat(@PathVariable("id") String idStr) {
        long id = Long.parseLong(idStr);
        repository.deleteById(id);
        return ResponseEntity.ok("Supprimé avec succès");
    }

    @PostMapping(
        value = "/creer",
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<Plat> creerPlat(@RequestBody PlatRequest platRequest) {
        List<Ingredient> ingredients = ingredientService.getIngredientsByIds(platRequest.getIngredientIds());
        Plat plat = new Plat(
                platRequest.getNom(),
                platRequest.getPrix(),
                ingredients,
                platRequest.getTempsPreparation(),
                platRequest.getTakeAway()
        );
        repository.save(plat);
        return ResponseEntity.ok(plat);
    }
 }
