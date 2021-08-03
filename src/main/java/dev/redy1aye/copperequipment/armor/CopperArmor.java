package dev.redy1aye.copperequipment.armor;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public enum CopperArmor implements ArmorMaterial {
    COPPER_ARMOR("copper", 12, SoundEvents.ARMOR_EQUIP_IRON, 0, 0,
            () -> Ingredient.of(Items.COPPER_INGOT));

    private static final int[] Durability = {134, 179, 198, 112};
    private static final int[] Protection = {2, 5, 6, 3};

    private final String name;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    CopperArmor(String name, int enchantability,
                        SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();

    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return Durability[slot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.Protection[slot.getIndex()];
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