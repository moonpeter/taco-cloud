package sia.tacos.web.api;

import jdk.nashorn.internal.objects.annotations.Getter;
import sia.tacos.Ingredient;
import sia.tacos.Taco;

import java.util.Date;
import java.util.List;

public class TacoResource extends ResourceSupport {

    private static final IngredientResourceAssembler ingredientAssembeler = new IngredientResourceAssembler();

    @Getter
    private final String name;

    @Getter
    private final Date createdAt;

    @Getter
    private final List<IngredientResource> ingredients;
}
