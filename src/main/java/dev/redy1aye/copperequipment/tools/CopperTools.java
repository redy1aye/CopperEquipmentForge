package dev.redy1aye.copperequipment.tools;

import dev.redy1aye.copperequipment.misc.Config;
import dev.redy1aye.copperequipment.Items;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@MethodsReturnNonnullByDefault
public class CopperTools implements Tier {

    public static final Tier COPPER_TOOL = new CopperTools();

    /* static int CopperToolsDurability = Config.CopperToolsDurability.get();
    static int CopperToolsMiningLevel = Config.CopperToolsMiningLevel.get(); */

    @Override
    public int getUses() {
        return 120;
    }

    @Override
    public float getSpeed() {
        return 6;
    }

    @Override
    public float getAttackDamageBonus() {
        return -1;
    }

    @Override
    public int getLevel() {
        return 2;
    }

    @Override
    public int getEnchantmentValue() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.COMPRESSED_COPPER.get());
    }
}