package co.origamigames.quazimodded;

import co.origamigames.quazimodded.init.QMBlocks;
import net.fabricmc.api.ClientModInitializer;

public class QuaziModdedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        QMBlocks.setBlockRenderLayers();
    }
}
