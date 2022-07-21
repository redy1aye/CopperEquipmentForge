package dev.redy1aye.copperequipment;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class Tags {
    public static class Items {
        public static final TagKey<Item> COPPER_STUFF = createTag("copper_stuff");
        public static final TagKey<Item> WAXED_COPPER_STUFF = createTag("waxed_copper_stuff");

        public static final TagKey<Item> NUGGETS = createForgeTag("nuggets");
        public static final TagKey<Item> NUGGETS_COPPER = createForgeTag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_WAXED_COPPER = createForgeTag("nuggets/waxed_copper");

        public static final TagKey<Item> INGOTS = createForgeTag("ingots");
        public static final TagKey<Item> INGOTS_COPPER = createForgeTag("ingots/copper");
        public static final TagKey<Item> INGOTS_WAXED_COPPER = createForgeTag("ingots/waxed_copper");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(new ResourceLocation(CopperEquipment.MOD_ID, name));
        }

        private static TagKey<Item> createForgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}