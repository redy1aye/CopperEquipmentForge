package dev.redy1aye.copperequipment;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class Tags {
    public static class Items {
        public static final TagKey<Item> COPPER_STUFF = createTag("copper_stuff");
        public static final TagKey<Item> WAXED_COPPER_STUFF = createTag("waxed_copper_stuff");

        public static final TagKey<Item> NUGGETS = createCommonTag("nuggets");
        public static final TagKey<Item> NUGGETS_COPPER = createCommonTag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_WAXED_COPPER = createCommonTag("nuggets/waxed_copper");

        public static final TagKey<Item> INGOTS = createCommonTag("ingots");
        public static final TagKey<Item> INGOTS_COPPER = createCommonTag("ingots/copper");
        public static final TagKey<Item> INGOTS_WAXED_COPPER = createCommonTag("ingots/waxed_copper");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CopperEquipment.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}
