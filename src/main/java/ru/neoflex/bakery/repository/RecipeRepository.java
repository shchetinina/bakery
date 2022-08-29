package ru.neoflex.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.bakery.model.Recipe;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAll();

    Recipe getOne(Long aLong);
}
