package dev.redy1aye.copperequipment.materials;

import dev.redy1aye.copperequipment.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ToolMaterials implements Tier {
    COPPER(250, 6.5F, 2.5F, 2, 14, Ingredients.COPPER),
    WAXED_COPPER(250, 6.5F, 2.5F, 2, 14, Ingredients.WAXED_COPPER);

    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int level;
    private final int enchantmentValue;
    private final Ingredient repairIngredient;

    ToolMaterials(int uses,
                  float speed,
                  float attackDamageBonus,
                  int level,
                  int enchantmentValue,
                  Ingredients repairType)
    {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairType.get();
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return BlockTags.MINEABLE_WITH_PICKAXE;
    }

    public enum Ingredients {
        COPPER(() -> Ingredient.of(Items.COPPER_NUGGET.get())),
        WAXED_COPPER(() -> Ingredient.of(Items.WAXED_COPPER_NUGGET.get()));

        private final java.util.function.Supplier<Ingredient> supplier;

        Ingredients(java.util.function.Supplier<Ingredient> supplier) {
            this.supplier = supplier;
        }

        public Ingredient get() {
            return supplier.get();
        }
    }
}