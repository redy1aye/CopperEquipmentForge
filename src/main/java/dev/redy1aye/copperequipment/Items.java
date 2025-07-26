package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.materials.ArmorMaterials;
import dev.redy1aye.copperequipment.materials.ToolMaterials;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(CopperEquipment.MOD_ID);

    public static final DeferredHolder<Item, Item> COMPRESSED_COPPER = ITEMS.register("compressed_copper", () ->
            new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> COMPRESSED_WAXED_COPPER = ITEMS.register("compressed_waxed_copper", () ->
            new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () ->
            new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_NUGGET = ITEMS.register("waxed_copper_nugget", () ->
            new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> COPPER_SWORD = ITEMS.register("copper_sword", () ->
            new SwordItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_AXE = ITEMS.register("copper_axe", () ->
            new AxeItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->
            new ShovelItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_HOE = ITEMS.register("copper_hoe", () ->
            new HoeItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_SHEARS = ITEMS.register("copper_shears", () ->
            new ShearsItem(new Item.Properties().stacksTo(1).durability(ToolMaterials.COPPER.getUses())));

    public static final DeferredHolder<Item, Item> WAXED_COPPER_SWORD = ITEMS.register("waxed_copper_sword", () ->
            new SwordItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_PICKAXE = ITEMS.register("waxed_copper_pickaxe", () ->
            new PickaxeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_AXE = ITEMS.register("waxed_copper_axe", () ->
            new AxeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_SHOVEL = ITEMS.register("waxed_copper_shovel", () ->
            new ShovelItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_HOE = ITEMS.register("waxed_copper_hoe", () ->
            new HoeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_SHEARS = ITEMS.register("waxed_copper_shears", () ->
            new ShearsItem(new Item.Properties().stacksTo(1).durability(ToolMaterials.WAXED_COPPER.getUses())));

    public static final DeferredHolder<Item, Item> COPPER_HELMET = ITEMS.register("copper_helmet", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_BOOTS = ITEMS.register("copper_boots", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredHolder<Item, Item> WAXED_COPPER_HELMET = ITEMS.register("waxed_copper_helmet", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_CHESTPLATE = ITEMS.register("waxed_copper_chestplate", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_LEGGINGS = ITEMS.register("waxed_copper_leggings", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_BOOTS = ITEMS.register("waxed_copper_boots", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredHolder<Item, Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () ->
            new AnimalArmorItem(ArmorMaterials.COPPER, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final DeferredHolder<Item, Item> WAXED_COPPER_HORSE_ARMOR = ITEMS.register("waxed_copper_horse_armor", () ->
            new AnimalArmorItem(ArmorMaterials.WAXED_COPPER, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
}