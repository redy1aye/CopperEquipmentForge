package dev.redy1aye.copperequipment.materials;

import dev.redy1aye.copperequipment.Items;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ToolMaterials implements Tier {
    COPPER(2, 120, 6, 17, () -> Ingredient.of(Items.COMPRESSED_COPPER.get())),
    WAXED_COPPER(2, 420, 4, 17, () -> Ingredient.of(Items.COMPRESSED_WAXED_COPPER.get()));

    private final int miningLevel;
    private final int durability;
    private final float miningSpeed;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ToolMaterials(int miningLevel, int durability, float miningSpeed, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.enchantability = enchantability;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.durability;
    }

    public float getSpeed() {
        return this.miningSpeed;
    }

    public float getAttackDamageBonus() {
        return -1;
    }

    public int getLevel() {
        return this.miningLevel;
    }

    public int getEnchantmentValue() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
