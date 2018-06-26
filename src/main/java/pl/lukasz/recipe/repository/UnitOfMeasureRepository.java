package pl.lukasz.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import pl.lukasz.recipe.entity.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
