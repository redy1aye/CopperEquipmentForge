package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.armor.CopperArmor;
import dev.redy1aye.copperequipment.armor.WaxedCopperArmor;
import dev.redy1aye.copperequipment.misc.Config;
import dev.redy1aye.copperequipment.misc.CreativeTab;
import dev.redy1aye.copperequipment.tools.CopperTools;
import dev.redy1aye.copperequipment.tools.WaxedCopperTools;

import net.minecraft.world.item.*;
import net.minecraft.world.entity.EquipmentSlot;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            CopperEquipment.MOD_ID);

    /* static int CopperSwordDamage = Config.CopperSwordDamage.get();
    static float CopperSwordAttackSpeed = Config.CopperSwordAttackSpeed.get();

    static int CopperAxeDamage = Config.CopperAxeDamage.get();
    static float CopperAxeAttackSpeed = Config.CopperAxeAttackSpeed.get();

        static int WaxedCopperSwordDamage = Config.WaxedCopperSwordDamage.get();
        static float WaxedCopperSwordAttackSpeed = Config.WaxedCopperSwordAttackSpeed.get();

        static int WaxedCopperAxeDamage = Config.WaxedCopperAxeDamage.get();
        static float WaxedCopperAxeAttackSpeed = Config.WaxedCopperAxeAttackSpeed.get(); */


    public static int CopperSwordDamage = 6; // Default = 6.
    public static float CopperSwordAttackSpeed = -2.3f; // Default = -2.3.

    public static int CopperAxeDamage = 9; // Default = 9.
    public static float CopperAxeAttackSpeed = -3.1f; // Default = -3.1.

    public static int WaxedCopperSwordDamage = 6; // Default = 6.
    public static float WaxedCopperSwordAttackSpeed = -2.5f; // Default = -2.5.

    public static int WaxedCopperAxeDamage = 9; // Default = 9.
    public static float WaxedCopperAxeAttackSpeed = -3.3f; // Default = -3.3.

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(CopperTools.COPPER_TOOL, CopperSwordDamage, CopperSwordAttackSpeed,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(CopperTools.COPPER_TOOL, 4, -2.7f,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(CopperTools.COPPER_TOOL, CopperAxeDamage, CopperAxeAttackSpeed,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(CopperTools.COPPER_TOOL, 4.5f, -2.9f,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(CopperTools.COPPER_TOOL, 1, -0.9f,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));


    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));



    public static final RegistryObject<Item> WAXED_COPPER_SWORD = ITEMS.register("waxed_copper_sword",
            () -> new SwordItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperSwordDamage, WaxedCopperSwordAttackSpeed,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_PICKAXE = ITEMS.register("waxed_copper_pickaxe",
            () -> new PickaxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4, -2.9f,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_AXE = ITEMS.register("waxed_copper_axe",
            () -> new AxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperAxeDamage, WaxedCopperAxeAttackSpeed,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_SHOVEL = ITEMS.register("waxed_copper_shovel",
            () -> new ShovelItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4.5f, -3.1f,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_HOE = ITEMS.register("waxed_copper_hoe",
            () -> new HoeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 1, -1.1f,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));


    public static final RegistryObject<Item> WAXED_COPPER_HELMET = ITEMS.register("waxed_copper_helmet",
            () -> new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_CHESTPLATE = ITEMS.register("waxed_copper_chestplate",
            () -> new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_LEGGINGS = ITEMS.register("waxed_copper_leggings",
            () -> new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> WAXED_COPPER_BOOTS = ITEMS.register("waxed_copper_boots",
            () -> new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeTab.TAB_COPPER)));


    public static final RegistryObject<Item> COMPRESSED_COPPER = ITEMS.register("compressed_copper",
            () -> new Item(new Item.Properties().tab(CreativeTab.TAB_COPPER)));

        public static final RegistryObject<Item> COMPRESSED_WAXED_COPPER = ITEMS.register("compressed_waxed_copper",
                () -> new Item(new Item.Properties().tab(CreativeTab.TAB_COPPER)));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTab.TAB_COPPER)));

        public static final RegistryObject<Item> WAXED_COPPER_NUGGET = ITEMS.register("waxed_copper_nugget",
                () -> new Item(new Item.Properties().tab(CreativeTab.TAB_COPPER)));


    public static final RegistryObject<Item> COPPER_SHEARS = ITEMS.register("copper_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).tab(CreativeTab.TAB_COPPER).durability(CopperTools.COPPER_TOOL.getUses())));

    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor",
            () -> new HorseArmorItem(6, "copper",
                    new Item.Properties().tab(CreativeTab.TAB_COPPER).stacksTo(1)));
}