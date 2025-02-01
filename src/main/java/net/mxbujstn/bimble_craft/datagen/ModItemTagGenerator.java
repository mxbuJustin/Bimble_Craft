package net.mxbujstn.bimble_craft.datagen;

import net.minecraft.tags.ItemTags;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mxbujstn.bimble_craft.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, BimbleCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BIMBLE_HELMET.get(),
                        ModItems.BIMBLE_CHESTPLATE.get(),
                        ModItems.BIMBLE_LEGGINGS.get(),
                        ModItems.BIMBLE_BOOTS.get());


    }
}