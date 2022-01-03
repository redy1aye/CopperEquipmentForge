package dev.redy1aye.copperequipment.armor;

import dev.redy1aye.copperequipment.Config;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;


public class CopperArmor implements ArmorMaterial
{
    static int CopperBootsDurability = Config.CopperBootsDurability.get();
    static int CopperLeggingsDurability = Config.CopperLeggingsDurability.get();
    static int CopperChestplateDurability = Config.CopperChestplateDurability.get();
    static int CopperHelmetDurability = Config.CopperHelmetDurability.get();

    static int CopperBootsProtection = Config.CopperBootsProtection.get();
    static int CopperLeggingsProtection = Config.CopperLeggingsProtection.get();
    static int CopperChestplateProtection = Config.CopperChestplateProtection.get();
    static int CopperHelmetProtection = Config.CopperHelmetProtection.get();

    public static final ArmorMaterial COPPER_ARMOR = new CopperArmor();

    private static final int[] Durability = new int[] {CopperBootsDurability, CopperLeggingsDurability, CopperChestplateDurability, CopperHelmetDurability};
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
        return Ingredient.of(Items.COPPER_INGOT);
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