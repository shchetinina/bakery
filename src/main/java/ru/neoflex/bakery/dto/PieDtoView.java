package ru.neoflex.bakery.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Schema(description = "Пользовательское представление пирожка")
public class PieDtoView {

    @NotNull
    @Schema(description = "Наименование")
    private String naming;

    @NotNull
    @Schema(description = "Стоимость за 1 шт.")
    private Double cost;

    @Schema(description = "Количество калорий в 1 ")
    private Integer numberOfCalories;

    @Schema(description = "Полезность")
    private Integer benefit;

    @Schema(description = "Время приготовления")
    private Integer tfp;
}
