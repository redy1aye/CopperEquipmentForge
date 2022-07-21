package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.materials.ArmorMaterials;
import dev.redy1aye.copperequipment.materials.ToolMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final CreativeModeTab TAB_COPPER = new CreativeModeTab("copperequipment_tab") {
        public ItemStack makeIcon() {
            return new ItemStack(Items.COMPRESSED_COPPER.get());
        }
    };
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            CopperEquipment.MOD_ID);

    public static final RegistryObject<Item> COMPRESSED_COPPER = ITEMS.register("compressed_copper", () ->
            new Item(new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COMPRESSED_WAXED_COPPER = ITEMS.register("compressed_waxed_copper", () ->
            new Item(new Item.Properties().tab(TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () ->
            new Item(new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_NUGGET = ITEMS.register("waxed_copper_nugget", () ->
            new Item(new Item.Properties().tab(TAB_COPPER)));

    /* TOOLS */
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () ->
            new SwordItem(ToolMaterials.COPPER, 6, -2.3f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(ToolMaterials.COPPER, 4, -2.7f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () ->
            new AxeItem(ToolMaterials.COPPER, 9, -3.1f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->
            new ShovelItem(ToolMaterials.COPPER, 4.5f, -2.9f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () ->
            new HoeItem(ToolMaterials.COPPER, 1, -0.9f, new Item.Properties().tab(TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_SWORD = ITEMS.register("waxed_copper_sword", () ->
            new SwordItem(ToolMaterials.WAXED_COPPER, 6, -2.5f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_PICKAXE = ITEMS.register("waxed_copper_pickaxe", () ->
            new PickaxeItem(ToolMaterials.WAXED_COPPER, 4, -2.9f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_AXE = ITEMS.register("waxed_copper_axe", () ->
            new AxeItem(ToolMaterials.WAXED_COPPER, 9, -3.3f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_SHOVEL = ITEMS.register("waxed_copper_shovel", () ->
            new ShovelItem(ToolMaterials.WAXED_COPPER, 4.5f, -3.1f, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_HOE = ITEMS.register("waxed_copper_hoe", () ->
            new HoeItem(ToolMaterials.WAXED_COPPER, 1, -1.1f, new Item.Properties().tab(TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_SHEARS = ITEMS.register("copper_shears", () ->
            new ShearsItem(new Item.Properties().stacksTo(1).tab(TAB_COPPER).durability(ToolMaterials.COPPER.getUses())));

    /* ARMOR */
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () ->
            new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () ->
            new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () ->
            new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () ->
            new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.FEET, new Item.Properties().tab(TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_HELMET = ITEMS.register("waxed_copper_helmet", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_CHESTPLATE = ITEMS.register("waxed_copper_chestplate", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_LEGGINGS = ITEMS.register("waxed_copper_leggings", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(TAB_COPPER)));
    public static final RegistryObject<Item> WAXED_COPPER_BOOTS = ITEMS.register("waxed_copper_boots", () ->
            new ArmorItem(ArmorMaterials.WAXED_COPPER, EquipmentSlot.FEET, new Item.Properties().tab(TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () ->
            new HorseArmorItem(6, "copper", new Item.Properties().tab(TAB_COPPER).stacksTo(1)));
}
