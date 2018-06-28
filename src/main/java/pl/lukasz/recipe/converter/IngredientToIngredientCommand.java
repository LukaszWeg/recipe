package pl.lukasz.recipe.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import pl.lukasz.recipe.command.IngredientCommand;
import pl.lukasz.recipe.entity.Ingredient;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

    private UnitOfMeasureToUnitOfMeasureCommand uom;

    public IngredientToIngredientCommand(UnitOfMeasureToUnitOfMeasureCommand uom) {
        this.uom = uom;
    }

    @Nullable
    @Override
    public IngredientCommand convert(Ingredient ingredient) {
        if (ingredient == null) {
            return null;
        }

        final IngredientCommand ingredientCommand = new IngredientCommand();
        ingredientCommand.setId(ingredient.getId());
        ingredientCommand.setAmount(ingredient.getAmount());
        ingredientCommand.setDescription(ingredient.getDescription());
        ingredientCommand.setUnitOfMeasure(uom.convert(ingredient.getUnitOfMeasure()));
        return ingredientCommand;
    }
}
