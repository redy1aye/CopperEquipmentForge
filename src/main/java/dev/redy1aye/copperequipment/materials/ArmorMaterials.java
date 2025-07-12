package dev.redy1aye.copperequipment.materials;

import java.util.function.Supplier;
import dev.redy1aye.copperequipment.Items;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
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

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        int index = switch (type) {
            case HELMET -> 0;
            case CHESTPLATE -> 1;
            case LEGGINGS -> 2;
            case BOOTS -> 3;
        };
        return durability[index] + this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        int index = switch (type) {
            case HELMET -> 0;
            case CHESTPLATE -> 1;
            case LEGGINGS -> 2;
            case BOOTS -> 3;
        };
        return this.slotProtections[index];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}