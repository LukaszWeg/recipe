package pl.lukasz.recipe.repository;


import org.springframework.data.repository.CrudRepository;
import pl.lukasz.recipe.entity.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
