package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.materials.ArmorMaterials;
import dev.redy1aye.copperequipment.materials.ToolMaterials;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public class Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CopperEquipment.MOD_ID);

    public static final DeferredItem<Item> COMPRESSED_COPPER = ITEMS.register("compressed_copper",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMPRESSED_WAXED_COPPER = ITEMS.register("compressed_waxed_copper",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WAXED_COPPER_NUGGET = ITEMS.register("waxed_copper_nugget",
            () -> new Item(new Item.Properties()));

    // --- Tools: Copper ---
    public static final DeferredItem<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ToolMaterials.COPPER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ToolMaterials.COPPER, 3, -2.4f))));
    public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ToolMaterials.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ToolMaterials.COPPER, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ToolMaterials.COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ToolMaterials.COPPER, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ToolMaterials.COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ToolMaterials.COPPER, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ToolMaterials.COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ToolMaterials.COPPER, 0F, -3.0f))));
    public static final DeferredItem<ShearsItem> COPPER_SHEARS = ITEMS.register("copper_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).durability(ToolMaterials.COPPER.getUses())));

    // --- Tools: Waxed Copper ---
    public static final DeferredItem<SwordItem> WAXED_COPPER_SWORD = ITEMS.register("waxed_copper_sword",
            () -> new SwordItem(ToolMaterials.WAXED_COPPER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ToolMaterials.WAXED_COPPER, 3, -2.4f))));
    public static final DeferredItem<PickaxeItem> WAXED_COPPER_PICKAXE = ITEMS.register("waxed_copper_pickaxe",
            () -> new PickaxeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ToolMaterials.WAXED_COPPER, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> WAXED_COPPER_SHOVEL = ITEMS.register("waxed_copper_shovel",
            () -> new ShovelItem(ToolMaterials.WAXED_COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ToolMaterials.WAXED_COPPER, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> WAXED_COPPER_AXE = ITEMS.register("waxed_copper_axe",
            () -> new AxeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ToolMaterials.WAXED_COPPER, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> WAXED_COPPER_HOE = ITEMS.register("waxed_copper_hoe",
            () -> new HoeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ToolMaterials.WAXED_COPPER, 0F, -3.0f))));
    public static final DeferredItem<ShearsItem> WAXED_COPPER_SHEARS = ITEMS.register("waxed_copper_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).durability(ToolMaterials.WAXED_COPPER.getUses())));

    // --- Armor: Copper ---
    public static final DeferredItem<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.BOOTS.getDurability(15))));

    // --- Armor: Waxed Copper ---
    public static final DeferredItem<ArmorItem> WAXED_COPPER_HELMET = ITEMS.register("waxed_copper_helmet",
            () -> new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.HELMET.getDurability(25))));
    public static final DeferredItem<ArmorItem> WAXED_COPPER_CHESTPLATE = ITEMS.register("waxed_copper_chestplate",
            () -> new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));
    public static final DeferredItem<ArmorItem> WAXED_COPPER_LEGGINGS = ITEMS.register("waxed_copper_leggings",
            () -> new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.LEGGINGS.getDurability(25))));
    public static final DeferredItem<ArmorItem> WAXED_COPPER_BOOTS = ITEMS.register("waxed_copper_boots",
            () -> new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.BOOTS.getDurability(25))));

    // --- Horse Armor ---
    public static final DeferredItem<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor",
            () -> new AnimalArmorItem(ArmorMaterials.COPPER, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> WAXED_COPPER_HORSE_ARMOR = ITEMS.register("waxed_copper_horse_armor",
            () -> new AnimalArmorItem(ArmorMaterials.WAXED_COPPER, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
}