package dev.redy1aye.copperequipment.misc;

import dev.redy1aye.copperequipment.CopperEquipment;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class CETags {
    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> COPPER_STUFF = createForgeTag("copper_stuff");
        public static final Tags.IOptionalNamedTag<Item> WAXED_COPPER_STUFF = createForgeTag("waxed_copper_stuff");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(CopperEquipment.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}