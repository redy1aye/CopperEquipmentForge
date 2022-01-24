package dev.redy1aye.copperequipment.misc;

import dev.redy1aye.copperequipment.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab TAB_COPPER = new CreativeModeTab("copperequipment_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.COMPRESSED_COPPER.get());
        }
    };
}