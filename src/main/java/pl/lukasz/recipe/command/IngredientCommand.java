package pl.lukasz.recipe.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.lukasz.recipe.entity.UnitOfMeasure;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure unitOfMeasure;
}
