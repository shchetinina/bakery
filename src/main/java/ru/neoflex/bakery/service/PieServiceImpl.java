package ru.neoflex.bakery.service;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import ru.neoflex.bakery.dto.PieDtoView;
import ru.neoflex.bakery.mapper.PieRecipeMapper;
import ru.neoflex.bakery.model.Pie;
import ru.neoflex.bakery.repository.PieRepository;
import ru.neoflex.bakery.repository.RecipeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PieServiceImpl implements PieService {

    private final PieRepository pieRepository;

    private final RecipeRepository recipeRepository;

    @Override
    public List<PieDtoView> findAll() {
        List<Pie> pies = pieRepository.findAll();
        List<PieDtoView> pieDtoViews = new ArrayList<>();
        PieRecipeMapper pieDtoMapper = Mappers.getMapper(PieRecipeMapper.class);

        for(Pie item:pies){
            //TODO обработать случай, когда нет записи Recipe для Pie.id
            pieDtoViews.add(pieDtoMapper.pieDtoView(item, recipeRepository.getOne(item.getId())));
        }
        return pieDtoViews;
    }
}
