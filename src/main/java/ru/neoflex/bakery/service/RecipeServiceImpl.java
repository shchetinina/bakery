package ru.neoflex.bakery.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.neoflex.bakery.model.Recipe;
import ru.neoflex.bakery.repository.RecipeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe getOne(Long id) {
        return recipeRepository.getOne(id);
    }
}
