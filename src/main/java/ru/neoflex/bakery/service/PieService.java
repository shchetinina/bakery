package ru.neoflex.bakery.service;

import ru.neoflex.bakery.dto.PieDtoView;
import ru.neoflex.bakery.model.Pie;

import java.util.List;

public interface PieService {
    List<PieDtoView> findAll();
}
