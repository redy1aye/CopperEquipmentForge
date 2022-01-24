package dev.redy1aye.copperequipment.armor;

import dev.redy1aye.copperequipment.misc.Config;
import dev.redy1aye.copperequipment.Items;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;


public class CopperArmor implements ArmorMaterial
{
    public static final ArmorMaterial COPPER_ARMOR = new CopperArmor();

    /* static int CopperBootsDurability = Config.CopperBootsDurability.get();
    static int CopperLeggingsDurability = Config.CopperLeggingsDurability.get();
    static int CopperChestplateDurability = Config.CopperChestplateDurability.get();
    static int CopperHelmetDurability = Config.CopperHelmetDurability.get();

    static int CopperBootsProtection = Config.CopperBootsProtection.get();
    static int CopperLeggingsProtection = Config.CopperLeggingsProtection.get();
    static int CopperChestplateProtection = Config.CopperChestplateProtection.get();
    static int CopperHelmetProtection = Config.CopperHelmetProtection.get(); */

    public static int CopperHelmetProtection = 2;
    public static int CopperChestplateProtection = 6;
    public static int CopperLeggingsProtection = 5;
    public static int CopperBootsProtection = 2;


    private static final int[] Durability = new int[] {104, 149, 168, 82};
    private static final int[] Protection = new int[] {CopperBootsProtection, CopperLeggingsProtection, CopperChestplateProtection, CopperHelmetProtection};


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
        return Ingredient.of(Items.COMPRESSED_COPPER.get());
    }

    @Override
    public String getName() {
        return "copper";
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