package dev.redy1aye.copperequipment.materials;

import java.util.function.Supplier;

import dev.redy1aye.copperequipment.Items;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ArmorMaterials implements ArmorMaterial {
    COPPER("copper", 0, new int[]{2, 5, 6, 2}, 12, () -> Ingredient.of(Items.COMPRESSED_COPPER.get())),
    WAXED_COPPER("waxed_copper", 230, new int[]{1, 4, 5, 2}, 12, () -> Ingredient.of(Items.COMPRESSED_WAXED_COPPER.get()));

    private static final int[] durability = new int[]{104, 149, 168, 82};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, Supplier<Ingredient> p_40481_) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return durability[p_40484_.getIndex()] + this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return 0;
    }

    public float getKnockbackResistance() {
        return 0;
    }
}
