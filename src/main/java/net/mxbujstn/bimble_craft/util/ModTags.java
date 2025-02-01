package net.mxbujstn.bimble_craft.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.mxbujstn.bimble_craft.BimbleCraft;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BIMBLE_DETECTOR_VALUABLES = tag("bimble_detector_valuables");
        public static final TagKey<Block> NEEDS_BIMBLE_TOOL = tag("needs_bimble_tool");


        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(BimbleCraft.MODID, name));
        }

    }

    public static class Items {


        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(BimbleCraft.MODID, name));
        }

    }
}
