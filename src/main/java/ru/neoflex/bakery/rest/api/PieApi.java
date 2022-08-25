package ru.neoflex.bakery.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.neoflex.bakery.model.Pie;
import java.util.List;

@RequestMapping("/api/v1/pies")
public interface PieApi {
    @GetMapping("/allpies")
    ResponseEntity<List<Pie>> findAll();


}
