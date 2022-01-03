package dev.redy1aye.copperequipment.tools;

import dev.redy1aye.copperequipment.Config;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@MethodsReturnNonnullByDefault
public class WaxedCopperTools implements Tier {

    static final int CopperToolsDurability = Config.CopperToolsDurability.get();
    static final int CopperToolsMiningLevel = Config.CopperToolsMiningLevel.get();

    public static final Tier WAXED_COPPER_TOOL = new WaxedCopperTools();

    @Override
    public int getUses() {
        return CopperToolsDurability;
    }

    @Override
    public float getSpeed() {
        return 6;
    }

    @Override
    public float getAttackDamageBonus() {
        return 2;
    }

    @Override
    public int getLevel() {
        return CopperToolsMiningLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.COPPER_INGOT);
    }
}