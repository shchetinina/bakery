package ru.neoflex.bakery.rest.controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.bakery.dto.PieDtoView;
import ru.neoflex.bakery.mapper.PieRecipeMapper;
import ru.neoflex.bakery.model.Pie;
import ru.neoflex.bakery.model.Recipe;
import ru.neoflex.bakery.rest.api.PieApi;
import ru.neoflex.bakery.service.PieService;
import ru.neoflex.bakery.service.RecipeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PieController implements PieApi {

    private final PieService pieService;

    @Override
    public ResponseEntity<List<PieDtoView>> findAll() {
        //TODO обработать негативные случаи
        return ResponseEntity.ok(pieService.findAll());
    }
}
