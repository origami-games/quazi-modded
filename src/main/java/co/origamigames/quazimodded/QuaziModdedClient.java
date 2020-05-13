package co.origamigames.quazimodded;

import co.origamigames.quazimodded.init.QMBlocks;
import co.origamigames.sheet.SheetLib;
import net.fabricmc.api.ClientModInitializer;

public class QuaziModdedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        setBlockRenderLayers();
    }

    public static void setBlockRenderLayers() {
        SheetLib.setTransparencyRenderLayer(QMBlocks.REINFORCED_GLASS);
        SheetLib.setTransparencyRenderLayer(QMBlocks.REINFORCED_GLASS_PANE);
    }
}
