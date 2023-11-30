package com.octo.masterclass.restaurant;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    public Double calculerPrixFormule(Formule formule) {
        return formule.composition.stream()
                .map(Plat::getPrix)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    public Integer calculerTempsDePreparation(Formule formule) {
        return formule.composition.stream()
                .map(Plat::getTempsPreparation)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
