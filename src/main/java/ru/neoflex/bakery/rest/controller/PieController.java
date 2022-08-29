package ru.neoflex.bakery.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.bakery.dto.PieDtoView;
import ru.neoflex.bakery.rest.api.PieApi;
import ru.neoflex.bakery.service.PieService;

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
