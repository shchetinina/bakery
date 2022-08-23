package ru.neoflex.bakery.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.neoflex.bakery.model.Pie;
import ru.neoflex.bakery.repository.PieRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PieServiceImpl implements PieService {

    private final PieRepository pieRepository;

    @Override
    public List<Pie> findAll() {
        return pieRepository.findAll();
    }
}
