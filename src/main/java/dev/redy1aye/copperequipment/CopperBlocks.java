package dev.redy1aye.copperequipment;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CopperBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, CopperEquipment.MOD_ID);
	
    public static final RegistryObject<Block> COPPER_BUTTON = registerBlock("copper_button",
            () -> new ButtonBlock(BlockSetType.COPPER, 10, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .strength(0.5F)
                    .sound(SoundType.COPPER)
                    .noCollission()
                    .pushReaction(PushReaction.DESTROY)));
    
    public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .noCollission()
                    .strength(0.5F)
                    .sound(SoundType.COPPER)
                    .pushReaction(PushReaction.DESTROY)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}