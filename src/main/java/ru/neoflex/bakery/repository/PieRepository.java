package ru.neoflex.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.bakery.model.Pie;

import java.util.List;

@Repository
public interface PieRepository extends JpaRepository<Pie, Long> {
    List<Pie> findAll();
}
