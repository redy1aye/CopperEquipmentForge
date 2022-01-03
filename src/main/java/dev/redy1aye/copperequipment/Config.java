package dev.redy1aye.copperequipment;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CE_CFG;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperHelmetDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperChestplateDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperLeggingsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperBootsDurability;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperHelmetProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperChestplateProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperLeggingsProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperBootsProtection;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperToolsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperToolsMiningLevel;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperSwordDamage;
    public static ForgeConfigSpec.ConfigValue<Float> CopperSwordAttackSpeed;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperAxeDamage;
    public static ForgeConfigSpec.ConfigValue<Float> CopperAxeAttackSpeed;

    
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperHelmetDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperChestplateDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperLeggingsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperBootsDurability;

    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperHelmetProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperChestplateProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperLeggingsProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperBootsProtection;

    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperToolsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperToolsMiningLevel;

    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperSwordDamage;
    public static ForgeConfigSpec.ConfigValue<Float> WaxedCopperSwordAttackSpeed;

    public static ForgeConfigSpec.ConfigValue<Integer> WaxedCopperAxeDamage;
    public static ForgeConfigSpec.ConfigValue<Float> WaxedCopperAxeAttackSpeed;


    static {
        BUILDER.push("The config is currently under development and is unstable.\nCopper Equipment Mod Config!");

        CopperHelmetDurability = BUILDER.define("Copper Helmet Durability", 82);
        CopperChestplateDurability = BUILDER.define("Copper Chestplate Durability", 168);
        CopperLeggingsDurability = BUILDER.define("Copper Leggings Durability", 149);
        CopperBootsDurability = BUILDER.define("Copper Boots Durability", 104);

        CopperHelmetProtection = BUILDER.comment(" # #").define("Copper Helmet Protection", 2);
        CopperChestplateProtection = BUILDER.define("Copper Chestplate Protection", 6);
        CopperLeggingsProtection = BUILDER.define("Copper Leggings Protection", 5);
        CopperBootsProtection = BUILDER.define("Copper Boots Protection", 2);


        CopperToolsDurability = BUILDER.comment(" # #\n # #").define("Copper Tools Durability", 120);
        CopperToolsMiningLevel = BUILDER.define("Copper Tools Mining Level", 2);

        CopperSwordDamage = BUILDER.comment(" # #").define("Copper Sword Damage", 6);
        CopperSwordAttackSpeed = BUILDER.define("Copper Sword Attack Speed", -2.3f);

        CopperAxeDamage = BUILDER.comment(" # #").define("Copper Axe Damage", 9);
        CopperAxeAttackSpeed = BUILDER.define("Copper Axe Attack Speed", -3.1f);

        BUILDER.pop();
        BUILDER.push("Copper Equipment Mod! Waxed Config!");

        WaxedCopperHelmetDurability = BUILDER.define("Waxed Copper Helmet Durability", 312);
        WaxedCopperChestplateDurability = BUILDER.define("Waxed Copper Chestplate Durability", 398);
        WaxedCopperLeggingsDurability = BUILDER.define("Waxed Copper Leggings Durability", 379);
        WaxedCopperBootsDurability = BUILDER.define("Waxed Copper Boots Durability", 334);

        WaxedCopperHelmetProtection = BUILDER.comment(" # #").define("Waxed Copper Helmet Protection", 1);
        WaxedCopperChestplateProtection = BUILDER.define("Waxed Copper Chestplate Protection", 5);
        WaxedCopperLeggingsProtection = BUILDER.define("Waxed Copper Leggings Protection", 4);
        WaxedCopperBootsProtection = BUILDER.define("Waxed Copper Boots Protection", 1);


        WaxedCopperToolsDurability = BUILDER.comment(" # #\n # #").define("Waxed Copper Tools Durability", 420);
        WaxedCopperToolsMiningLevel = BUILDER.define("Waxed Copper Tools Mining Level", 2);

        WaxedCopperSwordDamage = BUILDER.comment(" # #").define("Waxed Copper Sword Damage", 6);
        WaxedCopperSwordAttackSpeed = BUILDER.define("Waxed Copper Sword Attack Speed", -2.5f);

        WaxedCopperAxeDamage = BUILDER.comment(" # #").define("Waxed Copper Axe Damage", 9);
        WaxedCopperAxeAttackSpeed = BUILDER.define("Waxed Copper Axe Attack Speed", -3.3f);

        BUILDER.pop();
        CE_CFG = BUILDER.build();
    }
}
