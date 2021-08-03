package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.armor.CopperArmor;
import dev.redy1aye.copperequipment.tools.CopperTools;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Register {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            CopperEquipment.MOD_ID);

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(CopperTools.COPPER_TOOL, 3, -2.3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(CopperTools.COPPER_TOOL, 1, -2.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(CopperTools.COPPER_TOOL, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(CopperTools.COPPER_TOOL, 6, -3.1f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(CopperTools.COPPER_TOOL, -2, -0.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> EXAMPLE_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> EXAMPLE_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> EXAMPLE_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}