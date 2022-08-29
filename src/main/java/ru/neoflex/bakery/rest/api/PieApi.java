package ru.neoflex.bakery.rest.api;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.neoflex.bakery.dto.PieDtoView;
import java.util.List;

@RequestMapping("/api/v1/pies")
public interface PieApi {

    @ApiResponse(responseCode = "200", description = "Pies found")
    @ApiResponse(responseCode = "404", description = "Pies not found")
    @GetMapping("/allpies")
    ResponseEntity<List<PieDtoView>> findAll();
}
