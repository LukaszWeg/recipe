package pl.lukasz.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import pl.lukasz.recipe.entity.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
