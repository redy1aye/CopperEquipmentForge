package dev.redy1aye.copperequipment.materials;

import dev.redy1aye.copperequipment.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ToolMaterials {
    // Copper: between stone and iron
    public static final Tier COPPER = new SimpleTier(
            BlockTags.MINEABLE_WITH_PICKAXE,
            250,    // Durability (iron: 250, stone: 131)
            6.5f,   // Mining speed (iron: 6.0, stone: 4.0)
            2.5f,   // Attack damage (iron: 2.0, stone: 1.0)
            14,     // Enchantability (iron: 14, stone: 5)
            () -> Ingredient.of(
                net.minecraft.world.item.Items.COPPER_INGOT,
                Items.COPPER_NUGGET.get(),
                Items.WAXED_COPPER_NUGGET.get()
            )
    );

    public static final Tier WAXED_COPPER = new SimpleTier(
            BlockTags.MINEABLE_WITH_PICKAXE,
            250,
            6.5f,
            2.5f,
            14,
            () -> Ingredient.of(
                net.minecraft.world.item.Items.COPPER_INGOT,
                Items.WAXED_COPPER_NUGGET.get()
            )
    );
}