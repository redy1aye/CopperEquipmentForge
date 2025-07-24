package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.materials.ArmorMaterials;
import dev.redy1aye.copperequipment.materials.ToolMaterials;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.AnimalArmorItem;
import net.minecraft.world.item.AnimalArmorItem.BodyType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ShearsItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, CopperEquipment.MOD_ID);

    public static final RegistryObject<Item> COMPRESSED_COPPER =
        ITEMS.register("compressed_copper", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPRESSED_WAXED_COPPER =
        ITEMS.register("compressed_waxed_copper", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_NUGGET =
        ITEMS.register("copper_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_NUGGET =
        ITEMS.register("waxed_copper_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SWORD =
        ITEMS.register("copper_sword", () -> new SwordItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE =
        ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE =
        ITEMS.register("copper_axe", () -> new AxeItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL =
        ITEMS.register("copper_shovel", () -> new ShovelItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE =
        ITEMS.register("copper_hoe", () -> new HoeItem(ToolMaterials.COPPER, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHEARS =
        ITEMS.register("copper_shears", () -> new ShearsItem(
            new Item.Properties()
                .stacksTo(1)
                .durability(ToolMaterials.COPPER.getUses())
        ));

    public static final RegistryObject<Item> WAXED_COPPER_SWORD =
        ITEMS.register("waxed_copper_sword", () -> new SwordItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_PICKAXE =
        ITEMS.register("waxed_copper_pickaxe", () -> new PickaxeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_AXE =
        ITEMS.register("waxed_copper_axe", () -> new AxeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_SHOVEL =
        ITEMS.register("waxed_copper_shovel", () -> new ShovelItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_HOE =
        ITEMS.register("waxed_copper_hoe", () -> new HoeItem(ToolMaterials.WAXED_COPPER, new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_SHEARS =
        ITEMS.register("waxed_copper_shears", () -> new ShearsItem(
            new Item.Properties()
                .stacksTo(1)
                .durability(ToolMaterials.WAXED_COPPER.getUses())
        ));

    public static final RegistryObject<Item> COPPER_HELMET =
        ITEMS.register("copper_helmet", () -> new ArmorItem(
            ArmorMaterials.COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))
        ));
    public static final RegistryObject<Item> COPPER_CHESTPLATE =
        ITEMS.register("copper_chestplate", () -> new ArmorItem(
            ArmorMaterials.COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))
        ));
    public static final RegistryObject<Item> COPPER_LEGGINGS =
        ITEMS.register("copper_leggings", () -> new ArmorItem(
            ArmorMaterials.COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))
        ));
    public static final RegistryObject<Item> COPPER_BOOTS =
        ITEMS.register("copper_boots", () -> new ArmorItem(
            ArmorMaterials.COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))
        ));

    public static final RegistryObject<Item> WAXED_COPPER_HELMET =
        ITEMS.register("waxed_copper_helmet", () -> new ArmorItem(
            ArmorMaterials.WAXED_COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))
        ));
    public static final RegistryObject<Item> WAXED_COPPER_CHESTPLATE =
        ITEMS.register("waxed_copper_chestplate", () -> new ArmorItem(
            ArmorMaterials.WAXED_COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))
        ));
    public static final RegistryObject<Item> WAXED_COPPER_LEGGINGS =
        ITEMS.register("waxed_copper_leggings", () -> new ArmorItem(
            ArmorMaterials.WAXED_COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))
        ));
    public static final RegistryObject<Item> WAXED_COPPER_BOOTS =
        ITEMS.register("waxed_copper_boots", () -> new ArmorItem(
            ArmorMaterials.WAXED_COPPER.getHolder().orElseThrow(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))
        ));

    public static final RegistryObject<Item> COPPER_HORSE_ARMOR =
        ITEMS.register("copper_horse_armor", () -> new AnimalArmorItem(
            ArmorMaterials.COPPER.getHolder().orElseThrow(),
            BodyType.EQUESTRIAN,
			false,
            new Item.Properties().stacksTo(1)
        ));

    public static final RegistryObject<Item> WAXED_COPPER_HORSE_ARMOR =
        ITEMS.register("waxed_copper_horse_armor", () -> new AnimalArmorItem(
            ArmorMaterials.WAXED_COPPER.getHolder().orElseThrow(),
            BodyType.EQUESTRIAN,
			false,
            new Item.Properties().stacksTo(1)
        ));
}
