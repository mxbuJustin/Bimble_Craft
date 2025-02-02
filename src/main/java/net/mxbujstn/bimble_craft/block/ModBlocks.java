package net.mxbujstn.bimble_craft.block;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.block.custom.BimbleSoundBlock;
import net.mxbujstn.bimble_craft.block.custom.StabilizerBlock;
import net.mxbujstn.bimble_craft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BimbleCraft.MODID);

    public static final RegistryObject<Block> BIMBLE_BLOCK = registerBlock("bimble_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(55.0F,1200.0F)));
    public static final RegistryObject<Block> RAW_BIMBLE_BLOCK = registerBlock("raw_bimble_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(40.0F,1000.0F)));
    public static final RegistryObject<Block> BIMBLE_ORE = registerBlock("bimble_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(40.0F,1000.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BIMBLE_SOUND_BLOCK = registerBlock("bimble_sound_block",
            () -> new BimbleSoundBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(20.0F,800.0F)));

    public static final RegistryObject<Block> STABILZER = registerBlock("stabilizer",
            () -> new StabilizerBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
