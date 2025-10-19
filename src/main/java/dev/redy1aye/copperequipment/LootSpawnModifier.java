package dev.redy1aye.copperequipment;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

public class LootSpawnModifier extends LootModifier {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final MapCodec<LootSpawnModifier> CODEC = RecordCodecBuilder.mapCodec(instance -> LootModifier.codecStart(instance).apply(instance, LootSpawnModifier::new));

    public LootSpawnModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        var lootTableId = context.getQueriedLootTableId();
        if (lootTableId == null) {
            LOGGER.warn("Loot table ID is null in LootSpawnModifier");
            return generatedLoot;
        }

        LOGGER.info("Processing loot table: {}", lootTableId.toString());
        var random = context.getRandom();

        switch (lootTableId.toString()) {
            case "minecraft:chests/desert_pyramid" -> {
                if (random.nextFloat() < 0.27f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_HORSE_ARMOR.get(), random.nextInt(3) + 1));
                }
            }
            case "minecraft:chests/abandoned_mineshaft" -> {
                if (random.nextFloat() < 0.43f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_HORSE_ARMOR.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.24f) {
                    generatedLoot.add(new ItemStack(net.minecraft.world.item.Items.COPPER_INGOT, random.nextInt(7) + 1));
                }
                if (random.nextFloat() < 0.1f) {
                    generatedLoot.add(new ItemStack(net.minecraft.world.item.Items.RAW_COPPER_BLOCK, 1));
                }
                if (random.nextFloat() < 0.07f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_PICKAXE.get(), 1));
                }
            }
            case "minecraft:chests/simple_dungeon" -> {
                if (random.nextFloat() < 0.37f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_HORSE_ARMOR.get(), 1));
                }
            }
            case "minecraft:chests/jungle_temple" -> {
                if (random.nextFloat() < 0.68f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_HORSE_ARMOR.get(), random.nextInt(2) + 1));
                }
            }
            case "minecraft:chests/bastion_treasure" -> {
                if (random.nextFloat() < 0.09f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COMPRESSED_COPPER.get(), random.nextInt(8) + 2));
                }
            }
            case "minecraft:chests/bastion_other" -> {
                if (random.nextFloat() < 0.14f) {
                    generatedLoot.add(new ItemStack(net.minecraft.world.item.Items.COPPER_INGOT, random.nextInt(8) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(net.minecraft.world.item.Items.COPPER_BLOCK, 1));
                }
            }
            case "minecraft:chests/end_city_treasure" -> {
                if (random.nextFloat() < 0.12f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_HORSE_ARMOR.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.09f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COMPRESSED_COPPER.get(), random.nextInt(8) + 2));
                }
                if (random.nextFloat() < 0.11f) {
                    generatedLoot.add(new ItemStack(net.minecraft.world.item.Items.COPPER_BLOCK, random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_SWORD.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_SHOVEL.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_PICKAXE.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_AXE.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_HELMET.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_CHESTPLATE.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_LEGGINGS.get(), random.nextInt(2) + 1));
                }
                if (random.nextFloat() < 0.02f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_BOOTS.get(), random.nextInt(2) + 1));
                }
            }
            case "minecraft:chests/village/village_shepherd" -> {
                if (random.nextFloat() < 0.20f) {
                    generatedLoot.add(new ItemStack(dev.redy1aye.copperequipment.Items.COPPER_SHEARS.get(), 1));
                }
            }
        }

        return generatedLoot;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
