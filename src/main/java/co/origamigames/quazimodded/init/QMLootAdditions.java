package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import co.origamigames.sheet.SheetLib;

public class QMLootAdditions {
    public static void registerAll() {
        lootTableAddition("entities/squid");

        lootTableAddition("chests/abandoned_mineshaft");
        lootTableAddition("chests/desert_pyramid");
        lootTableAddition("chests/jungle_temple");
        lootTableAddition("chests/simple_dungeon");
        lootTableAddition("chests/woodland_mansion");
        lootTableAddition("chests/village/village_armorer");

        lootTableAddition("blocks/glass");
        lootTableAddition("blocks/white_stained_glass");
        lootTableAddition("blocks/orange_stained_glass");
        lootTableAddition("blocks/magenta_stained_glass");
        lootTableAddition("blocks/light_blue_stained_glass");
        lootTableAddition("blocks/yellow_stained_glass");
        lootTableAddition("blocks/lime_stained_glass");
        lootTableAddition("blocks/pink_stained_glass");
        lootTableAddition("blocks/gray_stained_glass");
        lootTableAddition("blocks/light_gray_stained_glass");
        lootTableAddition("blocks/cyan_stained_glass");
        lootTableAddition("blocks/purple_stained_glass");
        lootTableAddition("blocks/blue_stained_glass");
        lootTableAddition("blocks/brown_stained_glass");
        lootTableAddition("blocks/green_stained_glass");
        lootTableAddition("blocks/red_stained_glass");
        lootTableAddition("blocks/black_stained_glass");
    }
    
    private static void lootTableAddition(String loot_table) {
        SheetLib.lootTableAddition(QuaziModded.MOD_ID, loot_table);
    }
}
