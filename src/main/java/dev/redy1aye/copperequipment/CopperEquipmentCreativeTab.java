package dev.redy1aye.copperequipment;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CopperEquipmentCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CopperEquipment.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COPPER_TAB = CREATIVE_MODE_TABS.register("copperequipment_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.COMPRESSED_COPPER.get()))
                    .title(Component.translatable("itemGroup.copperequipment_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(Items.COMPRESSED_COPPER.get());
                        output.accept(Items.COMPRESSED_WAXED_COPPER.get());
                        output.accept(Items.COPPER_NUGGET.get());
                        output.accept(Items.WAXED_COPPER_NUGGET.get());

                        output.accept(Items.COPPER_SWORD.get());
                        output.accept(Items.COPPER_SHOVEL.get());
                        output.accept(Items.COPPER_PICKAXE.get());
                        output.accept(Items.COPPER_AXE.get());
                        output.accept(Items.COPPER_HOE.get());
                        output.accept(Items.COPPER_SHEARS.get());

                        output.accept(Items.COPPER_HELMET.get());
                        output.accept(Items.COPPER_CHESTPLATE.get());
                        output.accept(Items.COPPER_LEGGINGS.get());
                        output.accept(Items.COPPER_BOOTS.get());
                        output.accept(Items.COPPER_HORSE_ARMOR.get());

                        output.accept(Items.WAXED_COPPER_SWORD.get());
                        output.accept(Items.WAXED_COPPER_SHOVEL.get());
                        output.accept(Items.WAXED_COPPER_PICKAXE.get());
                         output.accept(Items.WAXED_COPPER_AXE.get());
                        output.accept(Items.WAXED_COPPER_HOE.get());
                        output.accept(Items.WAXED_COPPER_SHEARS.get());

                        output.accept(Items.WAXED_COPPER_HELMET.get());
                        output.accept(Items.WAXED_COPPER_CHESTPLATE.get());
                        output.accept(Items.WAXED_COPPER_LEGGINGS.get());
                        output.accept(Items.WAXED_COPPER_BOOTS.get());

                        output.accept(CopperBlocks.COPPER_BUTTON.get());
                        output.accept(CopperBlocks.COPPER_PRESSURE_PLATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}