package ru.neoflex.bakery.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.bakery.model.Pie;
import ru.neoflex.bakery.rest.api.PieApi;
import ru.neoflex.bakery.service.PieService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PieController implements PieApi {

    @Autowired
    private final PieService pieService;


    @Override
    public ResponseEntity<List<Pie>> findAll() {
        //TODO обработать негативные случаи
        return ResponseEntity.ok(pieService.findAll());
    }
}
