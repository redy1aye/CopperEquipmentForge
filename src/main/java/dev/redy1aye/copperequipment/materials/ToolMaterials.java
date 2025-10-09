package dev.redy1aye.copperequipment.materials;

import dev.redy1aye.copperequipment.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ToolMaterials {
    // Copper: between stone and iron
    public static final Tier COPPER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            190,
            5.0f,
            2.0f,
            12,
            () -> Ingredient.of(Items.COMPRESSED_COPPER.get())

    );

    public static final Tier WAXED_COPPER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            237,
            4.7f,
            2.0f,
            12,
            () -> Ingredient.of(Items.COMPRESSED_WAXED_COPPER.get())
    );
}