package dev.redy1aye.copperequipment.tools;

import dev.redy1aye.copperequipment.misc.Config;
import dev.redy1aye.copperequipment.Items;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@MethodsReturnNonnullByDefault
public class WaxedCopperTools implements Tier {

    public static final Tier WAXED_COPPER_TOOL = new WaxedCopperTools();

    /* static int WaxedCopperToolsDurability = Config.WaxedCopperToolsDurability.get();
    static int WaxedCopperToolsMiningLevel = Config.WaxedCopperToolsMiningLevel.get(); */

    @Override
    public int getUses() {
        return 420;
    }

    @Override
    public float getSpeed() {
        return 4;
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
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.COMPRESSED_WAXED_COPPER.get());
    }
}