package com.octo.masterclass.api;

import com.octo.masterclass.persistence.Ingredient;
import com.octo.masterclass.persistence.IngredientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    private final IngredientRepository repository;

    public IngredientController(IngredientRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Ingredient> listerIngredients() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ingredient> getIngredient(@PathVariable("id") String idStr) {
        long id = Long.parseLong(idStr);
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteIngredient(@PathVariable("id") String idStr) throws Exception {
        long id = Long.parseLong(idStr);
        repository.deleteById(id);
        return ResponseEntity.ok("Supprimé avec succès");
    }

    @PostMapping("/creer")
    public Ingredient creerIngredient(@RequestBody Ingredient ingredient) {
        return repository.save(ingredient);
    }
}
