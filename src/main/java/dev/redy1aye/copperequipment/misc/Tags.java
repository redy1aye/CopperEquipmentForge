package dev.redy1aye.copperequipment.misc;

import dev.redy1aye.copperequipment.CopperEquipment;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

public class Tags {
    public static class Items {

        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> COPPER_STUFF = createTag("copper_stuff");
        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> WAXED_COPPER_STUFF = createTag("waxed_copper_stuff");

        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> NUGGETS = createForgeTag("nuggets");
        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> NUGGETS_COPPER = createForgeTag("nuggets/copper");
        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> NUGGETS_WAXED_COPPER = createForgeTag("nuggets/waxed_copper");

        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> INGOTS = createForgeTag("ingots");
        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> INGOTS_COPPER = createForgeTag("ingots/copper");
        public static final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> INGOTS_WAXED_COPPER = createForgeTag("ingots/waxed_copper");


        private static net.minecraftforge.common.Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(CopperEquipment.MOD_ID, name));
        }

        private static net.minecraftforge.common.Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}