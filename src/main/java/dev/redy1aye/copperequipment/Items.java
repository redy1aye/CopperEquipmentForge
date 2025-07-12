package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.materials.ArmorMaterials;
import dev.redy1aye.copperequipment.materials.ToolMaterials;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            CopperEquipment.MOD_ID);

    public static final RegistryObject<Item> COMPRESSED_COPPER = ITEMS.register("compressed_copper", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPRESSED_WAXED_COPPER = ITEMS.register("compressed_waxed_copper", () ->
            new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_NUGGET = ITEMS.register("waxed_copper_nugget", () ->
            new Item(new Item.Properties()));

    /* TOOLS */
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () ->
            new SwordItem(ToolMaterials.COPPER, 6, -2.3f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(ToolMaterials.COPPER, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () ->
            new AxeItem(ToolMaterials.COPPER, 9, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->
            new ShovelItem(ToolMaterials.COPPER, 4.5f, -2.9f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () ->
            new HoeItem(ToolMaterials.COPPER, 1, -0.9f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHEARS = ITEMS.register("copper_shears", () ->
            new ShearsItem(new Item.Properties().stacksTo(1).durability(ToolMaterials.COPPER.getUses())));

    public static final RegistryObject<Item> WAXED_COPPER_SWORD = ITEMS.register("waxed_copper_sword", () ->
            new SwordItem(ToolMaterials.WAXED_COPPER, 6, -2.5f, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_PICKAXE = ITEMS.register("waxed_copper_pickaxe", () ->
            new PickaxeItem(ToolMaterials.WAXED_COPPER, 4, -2.9f, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_AXE = ITEMS.register("waxed_copper_axe", () ->
            new AxeItem(ToolMaterials.WAXED_COPPER, 9, -3.3f, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_SHOVEL = ITEMS.register("waxed_copper_shovel", () ->
            new ShovelItem(ToolMaterials.WAXED_COPPER, 4.5f, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_HOE = ITEMS.register("waxed_copper_hoe", () ->
            new HoeItem(ToolMaterials.WAXED_COPPER, 1, -1.1f, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_SHEARS = ITEMS.register("waxed_copper_shears", () ->
            new ShearsItem(new Item.Properties().stacksTo(1).durability(ToolMaterials.COPPER.getUses())));

    /* ARMOR */
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () ->
            new ArmorItem(ArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WAXED_COPPER_HELMET = ITEMS.register("waxed_copper_helmet", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_CHESTPLATE = ITEMS.register("waxed_copper_chestplate", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_LEGGINGS = ITEMS.register("waxed_copper_leggings", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_BOOTS = ITEMS.register("waxed_copper_boots", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () ->
            new HorseArmorItem(6, "copper", new Item.Properties().stacksTo(1)));
}