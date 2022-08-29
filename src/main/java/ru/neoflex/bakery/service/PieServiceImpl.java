package ru.neoflex.bakery.service;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import ru.neoflex.bakery.dto.PieDtoView;
import ru.neoflex.bakery.mapper.PieRecipeMapper;
import ru.neoflex.bakery.model.Pie;
import ru.neoflex.bakery.model.Recipe;
import ru.neoflex.bakery.repository.PieRepository;
import ru.neoflex.bakery.repository.RecipeRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PieServiceImpl implements PieService {

    private final PieRepository pieRepository;

    private final RecipeRepository recipeRepository;

    @Override
    public List<PieDtoView> findAll() throws EntityNotFoundException {
        List<Pie> pies = pieRepository.findAll();
        List<PieDtoView> pieDtoViews = new ArrayList<>();
        PieRecipeMapper pieDtoMapper = Mappers.getMapper(PieRecipeMapper.class);

        for(Pie item:pies){
            try{
                Recipe recipe = recipeRepository.getOne(item.getId());
                pieDtoViews.add(pieDtoMapper.pieDtoView(item, recipe));
            }
            catch(EntityNotFoundException ex){
                pieDtoViews.add(pieDtoMapper.pieDtoView(item, null));
            }
        }
        return pieDtoViews;
    }
}
