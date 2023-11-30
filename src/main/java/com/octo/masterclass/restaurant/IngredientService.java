package com.octo.masterclass.restaurant;

import com.octo.masterclass.persistence.Ingredient;
import com.octo.masterclass.persistence.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    public List<Ingredient> getIngredientsByIds(Iterable<Long> ingredientIds) {
        return (List<Ingredient>) repository.findAllById(ingredientIds);
    }
}
