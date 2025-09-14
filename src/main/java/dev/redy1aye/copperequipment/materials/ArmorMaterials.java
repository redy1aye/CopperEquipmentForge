package dev.redy1aye.copperequipment.materials;

import dev.redy1aye.copperequipment.CopperEquipment;
import dev.redy1aye.copperequipment.CopperEquipmentConfig;
import dev.redy1aye.copperequipment.Items;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class ArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMORS =
        DeferredRegister.create(Registries.ARMOR_MATERIAL, CopperEquipment.MOD_ID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> COPPER =
        ARMORS.register("copper", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, CopperEquipmentConfig.COPPER_HELMET_PROTECTION.get());
                map.put(ArmorItem.Type.CHESTPLATE, CopperEquipmentConfig.COPPER_CHESTPLATE_PROTECTION.get());
                map.put(ArmorItem.Type.LEGGINGS, CopperEquipmentConfig.COPPER_LEGGINGS_PROTECTION.get());
                map.put(ArmorItem.Type.BOOTS, CopperEquipmentConfig.COPPER_BOOTS_PROTECTION.get());
                map.put(ArmorItem.Type.BODY, CopperEquipmentConfig.COPPER_HORSE_ARMOR_PROTECTION.get());
            }),
            12,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(Items.COMPRESSED_COPPER.get()),
            List.of(new ArmorMaterial.Layer(
                ResourceLocation.fromNamespaceAndPath(CopperEquipment.MOD_ID, "copper")
            )),
            0.0F,
            0.0F
        ));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> WAXED_COPPER =
        ARMORS.register("waxed_copper", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, CopperEquipmentConfig.WAXED_COPPER_HELMET_PROTECTION.get());
                map.put(ArmorItem.Type.CHESTPLATE, CopperEquipmentConfig.WAXED_COPPER_CHESTPLATE_PROTECTION.get());
                map.put(ArmorItem.Type.LEGGINGS, CopperEquipmentConfig.WAXED_COPPER_LEGGINGS_PROTECTION.get());
                map.put(ArmorItem.Type.BOOTS, CopperEquipmentConfig.WAXED_COPPER_BOOTS_PROTECTION.get());
                map.put(ArmorItem.Type.BODY, CopperEquipmentConfig.WAXED_COPPER_HORSE_ARMOR_PROTECTION.get());
            }),
            12,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(Items.COMPRESSED_WAXED_COPPER.get()),
            List.of(new ArmorMaterial.Layer(
                ResourceLocation.fromNamespaceAndPath(CopperEquipment.MOD_ID, "waxed_copper")
            )),
            0.0F,
            0.0F
        ));
}