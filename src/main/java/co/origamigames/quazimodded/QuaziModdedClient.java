package co.origamigames.quazimodded;

import co.origamigames.quazimodded.init.QMBlocks;
import net.fabricmc.api.ClientModInitializer;

// import co.origamigames.quazimodded.entity.OwlEntityModel;
// import co.origamigames.quazimodded.entity.OwlEntityRenderer;
// import co.origamigames.quazimodded.init.QMEntities;
// import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class QuaziModdedClient implements ClientModInitializer {

    @Override
    // @SuppressWarnings({ "unchecked" })
    public void onInitializeClient() {
        // EntityRendererRegistry.INSTANCE.register(QMEntities.OWL, (dispatcher, context) -> new OwlEntityRenderer(dispatcher, new OwlEntityModel(), 0.7F));

        QMBlocks.setBlockRenderLayers();
    }
}
