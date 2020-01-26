package co.origamigames.quazimodded;

import co.origamigames.quazimodded.init.*;
import co.origamigames.sheet.SheetLib;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuaziModded implements ModInitializer {
    public static final String MOD_ID = "quazi-modded";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(QMBlocks.REINFORCED_GLASS));
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("[Quazi-Modded] Loaded");

        // register stuff
        QMLootAdditions.registerAll();
        QMBlocks.addBlocksToFuelRegistry();

        // new QMBiomes();
        new QMEntities();
        new QMBlocks();
        new QMItems();

        // world gen
        QMWorldGen.addFeatures();
    }
}
