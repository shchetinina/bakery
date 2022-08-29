package ru.neoflex.bakery.service;

import ru.neoflex.bakery.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();

    Recipe getOne(Long id);
}
