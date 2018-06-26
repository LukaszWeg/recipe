package pl.lukasz.recipe.service;

import pl.lukasz.recipe.entity.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
