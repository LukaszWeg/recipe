package pl.lukasz.recipe.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import pl.lukasz.recipe.command.IngredientCommand;
import pl.lukasz.recipe.command.UnitOfMeasureCommand;
import pl.lukasz.recipe.entity.Ingredient;

@Component
public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {

    private UnitOfMeasureCommandToUnitOfMeasure uom;

    public IngredientCommandToIngredient(UnitOfMeasureCommandToUnitOfMeasure uom) {
        this.uom = uom;
    }

    @Nullable
    @Override
    public Ingredient convert(IngredientCommand ingredientCommand) {
        if(ingredientCommand == null) {
            return null;
        }
        final Ingredient ingredient = new Ingredient();
        ingredient.setId(ingredientCommand.getId());
        ingredient.setDescription(ingredientCommand.getDescription());
        ingredient.setAmount(ingredientCommand.getAmount());
        ingredient.setUnitOfMeasure(uom.convert(ingredientCommand.getUnitOfMeasure()));
        return ingredient;
    }
}
