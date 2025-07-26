package dev.redy1aye.copperequipment.materials;

import dev.redy1aye.copperequipment.CopperEquipment;
import dev.redy1aye.copperequipment.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.Util;

import java.util.EnumMap;
import java.util.List;

public class ArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMORS = DeferredRegister.create(Registries.ARMOR_MATERIAL, CopperEquipment.MOD_ID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> COPPER = ARMORS.register("copper", () -> new ArmorMaterial(
        Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.HELMET, 2);
            map.put(ArmorItem.Type.CHESTPLATE, 6);
            map.put(ArmorItem.Type.LEGGINGS, 5);
            map.put(ArmorItem.Type.BOOTS, 2);
			map.put(ArmorItem.Type.BODY, 6);
        }),
        12,
        SoundEvents.ARMOR_EQUIP_IRON,
        () -> Ingredient.of(Items.COMPRESSED_COPPER.get()),
        List.of(new ArmorMaterial.Layer(new ResourceLocation(CopperEquipment.MOD_ID, "copper"))),
        0.0F,
        0.0F
    ));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> WAXED_COPPER = ARMORS.register("waxed_copper", () -> new ArmorMaterial(
        Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.HELMET, 2);
            map.put(ArmorItem.Type.CHESTPLATE, 6);
            map.put(ArmorItem.Type.LEGGINGS, 5);
            map.put(ArmorItem.Type.BOOTS, 2);
		    map.put(ArmorItem.Type.BODY, 5);
        }),
        12,
        SoundEvents.ARMOR_EQUIP_IRON,
        () -> Ingredient.of(Items.COMPRESSED_WAXED_COPPER.get()),
        List.of(new ArmorMaterial.Layer(new ResourceLocation(CopperEquipment.MOD_ID, "waxed_copper"))),
        0.0F,
        0.0F
    ));
}