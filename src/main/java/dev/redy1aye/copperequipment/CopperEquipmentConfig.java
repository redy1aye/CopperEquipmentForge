package dev.redy1aye.copperequipment;

import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class CopperEquipmentConfig {
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.IntValue COPPER_HELMET_PROTECTION;
    public static final ModConfigSpec.IntValue COPPER_CHESTPLATE_PROTECTION;
    public static final ModConfigSpec.IntValue COPPER_LEGGINGS_PROTECTION;
    public static final ModConfigSpec.IntValue COPPER_BOOTS_PROTECTION;
    public static final ModConfigSpec.IntValue COPPER_HORSE_ARMOR_PROTECTION;

    public static final ModConfigSpec.IntValue WAXED_COPPER_HELMET_PROTECTION;
    public static final ModConfigSpec.IntValue WAXED_COPPER_CHESTPLATE_PROTECTION;
    public static final ModConfigSpec.IntValue WAXED_COPPER_LEGGINGS_PROTECTION;
    public static final ModConfigSpec.IntValue WAXED_COPPER_BOOTS_PROTECTION;
    public static final ModConfigSpec.IntValue WAXED_COPPER_HORSE_ARMOR_PROTECTION;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("Copper Equipment Mod Config",
                "Protection values for copper armor (durability fixed: helmet=121, chestplate=176, leggings=165, boots=143).");

        COPPER_HELMET_PROTECTION = builder
                .comment("Protection value for copper helmet")
                .defineInRange("copperHelmetProtection", 2, 0, 10);
        COPPER_CHESTPLATE_PROTECTION = builder
                .comment("Protection value for copper chestplate")
                .defineInRange("copperChestplateProtection", 4, 0, 10);
        COPPER_LEGGINGS_PROTECTION = builder
                .comment("Protection value for copper leggings")
                .defineInRange("copperLeggingsProtection", 3, 0, 10);
        COPPER_BOOTS_PROTECTION = builder
                .comment("Protection value for copper boots")
                .defineInRange("copperBootsProtection", 1, 0, 10);
        COPPER_HORSE_ARMOR_PROTECTION = builder
                .comment("Protection value for copper horse armor")
                .defineInRange("copperHorseArmorProtection", 4, 0, 10);

        builder.comment("Waxed Copper Equipment Config",
                "Protection values for waxed copper armor (durability fixed: helmet=242, chestplate=352, leggings=330, boots=286).");

        WAXED_COPPER_HELMET_PROTECTION = builder
                .comment("Protection value for waxed copper helmet")
                .defineInRange("waxedCopperHelmetProtection", 1, 0, 10);
        WAXED_COPPER_CHESTPLATE_PROTECTION = builder
                .comment("Protection value for waxed copper chestplate")
                .defineInRange("waxedCopperChestplateProtection", 2, 0, 10);
        WAXED_COPPER_LEGGINGS_PROTECTION = builder
                .comment("Protection value for waxed copper leggings")
                .defineInRange("waxedCopperLeggingsProtection", 2, 0, 10);
        WAXED_COPPER_BOOTS_PROTECTION = builder
                .comment("Protection value for waxed copper boots")
                .defineInRange("waxedCopperBootsProtection", 1, 0, 10);
        WAXED_COPPER_HORSE_ARMOR_PROTECTION = builder
                .comment("Protection value for waxed copper horse armor")
                .defineInRange("waxedCopperHorseArmorProtection", 2, 0, 10);

        SPEC = builder.build();
    }
}