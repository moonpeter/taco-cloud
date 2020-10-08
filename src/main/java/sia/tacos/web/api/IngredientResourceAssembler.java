package sia.tacos.web.api;

import sia.tacos.Ingredient;

public class IngredientResourceAssembler extends ResourceAssemblerSupport<Ingredient, Ingredientresource> {

    public IngredientResourceAssembler() {
        super(IngredientController2.class, IngredientResource.class);
    }

    @Override
    public IngredientResource ToResource(Ingredient ingredient) {
        return createResourceWithId(ingredient.getId(), ingredient);
    }

    
    @Override
    protected IngredientResource ingredientResource(Ingredient ingredient) {
        return new IngredientResource(ingredient);
    }
}
