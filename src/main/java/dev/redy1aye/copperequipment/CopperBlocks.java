package dev.redy1aye.copperequipment;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.Supplier;

public class CopperBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(CopperEquipment.MOD_ID);

    public static final DeferredHolder<Block, Block> COPPER_BUTTON = registerBlock("copper_button", () ->
            new ButtonBlock(BlockSetType.COPPER, 10, BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .mapColor(MapColor.METAL)));
    public static final DeferredHolder<Block, Block> COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate", () ->
            new PressurePlateBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .mapColor(MapColor.METAL)));

    private static <T extends Block> DeferredHolder<Block, T> registerBlock(String name, Supplier<T> block) {
        DeferredHolder<Block, T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredHolder<Item, Item> registerBlockItem(String name, DeferredHolder<Block, T> block) {
        return Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}