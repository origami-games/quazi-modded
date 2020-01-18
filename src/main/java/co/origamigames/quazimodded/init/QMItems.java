package co.origamigames.quazimodded.init;

import co.origamigames.quazimodded.QuaziModded;
import co.origamigames.quazimodded.item.*;
import co.origamigames.sheet.SheetLib;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// import net.minecraft.entity.EntityType;
// import net.minecraft.item.SpawnEggItem;

public class QMItems {
    // define constants
    public static final String glass_shard = "glass_shard";
    public static final String cooked = "cooked_";
    public static final int max_count_default = 64;

    // define items
//    public static final Item ASH = register("ash", max_count_default);
    public static final Item ASH = register("ash", max_count_default);
    public static final Item BEESWAX = register("beeswax", max_count_default);

    public static final Item AMETHYST = register("amethyst", max_count_default);

    public static final Item LEAD_INGOT = register("lead_ingot", max_count_default);
    // public static final Item LEAD_SWORD = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_sword"), new SwordBase(QMToolMaterials.LEAD, 3, -2.4F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_SHOVEL = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_shovel"), new ShovelBase(QMToolMaterials.LEAD, 1.5F, -3.0F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_PICKAXE = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_pickaxe"), new PickaxeBase(QMToolMaterials.LEAD, 1, -2.8F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_AXE = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_axe"), new AxeBase(QMToolMaterials.LEAD, 6.0F, -3.1F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    // public static final Item LEAD_HOE = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_hoe"), new HoeBase(QMToolMaterials.LEAD, -1.0F, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));

    public static final Item HERMES_BOOTS = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "hermes_boots"), new HermesBootsItem(QMArmorMaterials.HERMES_BOOTS, EquipmentSlot.FEET, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));
    public static final Item LEAD_HELMET = Registry.register(Registry.ITEM, new Identifier(QuaziModded.MOD_ID, "lead_helmet"), new LeadHelmetItem(QMArmorMaterials.LEAD_HELMET, EquipmentSlot.HEAD, (new Item.Settings()).group(QuaziModded.ITEM_GROUP)));

    public static final Item CALAMARI = registerFood("calamari", max_count_default, 2, 0.3f);
    public static final Item COOKED_CALAMARI = registerFoodSnack(cooked + "calamari", max_count_default, 6, 0.6f);

    // public static final Item OWL_SPAWN_EGG = registerSpawnEgg("owl", max_count_default, QMEntities.OWL, 0xFED639, 0xFBEBAE);

    public static final Item GLASS_SHARD = register(glass_shard, max_count_default);
    public static final Item WHITE_GLASS_SHARD = register("white_" + glass_shard, max_count_default);
    public static final Item ORANGE_GLASS_SHARD = register("orange_" + glass_shard, max_count_default);
    public static final Item MAGENTA_GLASS_SHARD = register("magenta_" + glass_shard, max_count_default);
    public static final Item LIGHT_BLUE_GLASS_SHARD = register("light_blue_" + glass_shard, max_count_default);
    public static final Item YELLOW_GLASS_SHARD = register("yellow_" + glass_shard, max_count_default);
    public static final Item LIME_GLASS_SHARD = register("lime_" + glass_shard, max_count_default);
    public static final Item PINK_GLASS_SHARD = register("pink_" + glass_shard, max_count_default);
    public static final Item GRAY_GLASS_SHARD = register("gray_" + glass_shard, max_count_default);
    public static final Item LIGHT_GRAY_GLASS_SHARD = register("light_gray_" + glass_shard, max_count_default);
    public static final Item CYAN_GLASS_SHARD = register("cyan_" + glass_shard, max_count_default);
    public static final Item PURPLE_GLASS_SHARD = register("purple_" + glass_shard, max_count_default);
    public static final Item BLUE_GLASS_SHARD = register("blue_" + glass_shard, max_count_default);
    public static final Item BROWN_GLASS_SHARD = register("brown_" + glass_shard, max_count_default);
    public static final Item GREEN_GLASS_SHARD = register("green_" + glass_shard, max_count_default);
    public static final Item RED_GLASS_SHARD = register("red_" + glass_shard, max_count_default);
    public static final Item BLACK_GLASS_SHARD = register("black_" + glass_shard, max_count_default);

    private static Item register(String id, int max_count) {
        return SheetLib.item(QuaziModded.MOD_ID, id, QuaziModded.ITEM_GROUP, max_count);
    }

    private static Item registerFood(String id, int max_count, int hunger, float saturationModifier) {
        return SheetLib.item(QuaziModded.MOD_ID, id, new Item(new Item.Settings().maxCount(max_count).group(QuaziModded.ITEM_GROUP).food(
                new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifier).build())));
    }
    private static Item registerFoodSnack(String id, int max_count, int hunger, float saturationModifier) {
        return SheetLib.item(QuaziModded.MOD_ID, id, new Item(new Item.Settings().maxCount(max_count).group(QuaziModded.ITEM_GROUP)
                .food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifier).snack()
                        .build())));
    }
}
