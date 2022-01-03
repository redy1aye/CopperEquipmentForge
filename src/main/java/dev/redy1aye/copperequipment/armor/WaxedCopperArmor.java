package dev.redy1aye.copperequipment.armor;

import dev.redy1aye.copperequipment.Config;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;


public class WaxedCopperArmor implements ArmorMaterial {

    static int WaxedCopperBootsDurability = Config.WaxedCopperBootsDurability.get();
    static int WaxedCopperLeggingsDurability = Config.WaxedCopperLeggingsDurability.get();
    static int WaxedCopperChestplateDurability = Config.WaxedCopperChestplateDurability.get();
    static int WaxedCopperHelmetDurability = Config.WaxedCopperHelmetDurability.get();

    static int WaxedCopperBootsProtection = Config.WaxedCopperBootsProtection.get();
    static int WaxedCopperLeggingsProtection = Config.CopperLeggingsProtection.get();
    static int WaxedCopperChestplateProtection = Config.CopperChestplateProtection.get();
    static int WaxedCopperHelmetProtection = Config.CopperHelmetProtection.get();

    public static final ArmorMaterial WAXED_COPPER_ARMOR = new WaxedCopperArmor();

    private static final int[] Durability = new int[] {WaxedCopperBootsDurability, WaxedCopperLeggingsDurability, WaxedCopperChestplateDurability, WaxedCopperHelmetDurability};
    private static final int[] Protection = new int[] {WaxedCopperBootsProtection, WaxedCopperLeggingsProtection, WaxedCopperChestplateProtection, WaxedCopperHelmetProtection};


    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return Durability[slot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return Protection[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return 12;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return "waxed_copper";
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