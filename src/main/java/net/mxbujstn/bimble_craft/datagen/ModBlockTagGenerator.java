package net.mxbujstn.bimble_craft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.block.ModBlocks;
import net.mxbujstn.bimble_craft.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BimbleCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.BIMBLE_DETECTOR_VALUABLES)
                .add(ModBlocks.BIMBLE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BIMBLE_ORE.get(),
                    ModBlocks.RAW_BIMBLE_BLOCK.get(),
                    ModBlocks.BIMBLE_BLOCK.get(),
                    ModBlocks.BIMBLE_SOUND_BLOCK.get());


        /* this.tag(BlockTags.NEEDS_IRON_TOOL); //may add matching Blocks
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
        this.tag(BlockTags.NEEDS_STONE_TOOL);
        */
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.BIMBLE_ORE.get())
                .add(ModBlocks.BIMBLE_BLOCK.get())
                .add(ModBlocks.RAW_BIMBLE_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_BIMBLE_TOOL)
                .add(ModBlocks.BIMBLE_SOUND_BLOCK.get());
    }
}
