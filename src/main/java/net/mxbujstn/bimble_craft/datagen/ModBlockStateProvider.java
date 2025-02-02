package net.mxbujstn.bimble_craft.datagen;

import net.minecraftforge.client.model.generators.ModelFile;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BimbleCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Blocks
        blockWithItem(ModBlocks.BIMBLE_BLOCK);
        blockWithItem(ModBlocks.RAW_BIMBLE_BLOCK);

        simpleBlockWithItem(ModBlocks.STABILZER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/stabilizer")));

        //Ores
        blockWithItem(ModBlocks.BIMBLE_ORE);

        //Other
        blockWithItem(ModBlocks.BIMBLE_SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}