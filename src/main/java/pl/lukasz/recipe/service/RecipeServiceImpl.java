package pl.lukasz.recipe.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lukasz.recipe.entity.Recipe;
import pl.lukasz.recipe.repository.RecipeRepository;

import java.util.HashSet;
import java.util.Set;
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    public RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("Im in recipe service");
        Set<Recipe> recipes = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
