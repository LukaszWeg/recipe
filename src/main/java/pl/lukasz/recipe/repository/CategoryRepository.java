package pl.lukasz.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukasz.recipe.entity.Category;


public interface CategoryRepository extends CrudRepository<Category, Long> {
}
