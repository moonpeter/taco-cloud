package sia.tacos.web.api;

import jdk.nashorn.internal.objects.annotations.Getter;
import sia.tacos.Ingredient;
import sia.tacos.Taco;

import java.util.Date;
import java.util.List;

public class TacoResource extends ResourceSupport {

    @Getter
    private final String name;

    @Getter
    private final Date createdAt;

    @Getter
    private final List<Ingredient> ingredients;

    public TacoResource(Taco taco) {
        this.name = taco.getName();
        this.createdAt = taco.getCreatedAt();
        this.ingredients = taco.getIngredients();
    }
}
