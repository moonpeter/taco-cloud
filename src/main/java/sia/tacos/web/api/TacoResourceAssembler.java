package sia.tacos.web.api;

import sia.tacos.Taco;
import sia.tacos.web.DesignTacoController;

public class TacoResourceAssembler extends ResourceAssemblerSupport<Taco, TacoResource{

    public TacoResourceAssembler() {
        super(DesignTacoController.class, TacoResource.class);
    }

    @Override
    protected TacoResource instantiateResource(Taco taco) {
        return new TacoResource(taco);
    }

    @Override
    public TacoResource toResource(Taco taco) {
        return createResourceWithId(taco.getId(), taco);
    }
}
