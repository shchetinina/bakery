package ru.neoflex.bakery.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.neoflex.bakery.dto.PieDtoView;
import ru.neoflex.bakery.model.Pie;
import ru.neoflex.bakery.model.Recipe;

@Mapper(componentModel = "spring")
public interface PieRecipeMapper {
    @Mapping(target = "naming", source = "pie.name")
    @Mapping(target = "cost", source = "pie.price")
    @Mapping(target = "numberOfCalories", source = "recipe.calories")
    @Mapping(target = "benefit", source = "recipe.usefulness")
    @Mapping(target = "tfp", source = "recipe.ttm")
    PieDtoView pieDtoView(Pie pie, Recipe recipe);
}
