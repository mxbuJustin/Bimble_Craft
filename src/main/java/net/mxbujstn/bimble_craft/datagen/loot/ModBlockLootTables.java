package net.mxbujstn.bimble_craft.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.mxbujstn.bimble_craft.block.ModBlocks;
import net.mxbujstn.bimble_craft.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BIMBLE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_BIMBLE_BLOCK.get());
        this.dropSelf(ModBlocks.BIMBLE_SOUND_BLOCK.get());

        this.add(ModBlocks.BIMBLE_ORE.get(),
            block -> createOreDrop(ModBlocks.BIMBLE_ORE.get(), ModItems.RAW_UNSTABLE_BIMBLE_ORE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject:: get)::iterator;
    }
}
