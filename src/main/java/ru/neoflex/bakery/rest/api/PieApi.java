package ru.neoflex.bakery.rest.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.neoflex.bakery.dto.PieDtoView;

import java.util.List;

@RequestMapping("/api/v1/pies")
@Tag(name = "PieController", description = "Пользовательское представление пирожка")
public interface PieApi {

    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Pies found",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = PieDtoView.class))),
        @ApiResponse(responseCode = "404", description = "Pies not found",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Error.class)))
    })
    @Operation(summary = "Получение информации о всех пирожках", description = "Получение информации о всех пирожках")
    @GetMapping("/allpies")
    ResponseEntity<List<PieDtoView>> findAll();
}
