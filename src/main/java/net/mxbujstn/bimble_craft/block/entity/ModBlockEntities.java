package net.mxbujstn.bimble_craft.block.entity;

import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BimbleCraft.MODID);

    public static final RegistryObject<BlockEntityType<StabilizerBlockEntity>> STABILIZER_BE =
            BLOCK_ENTITIES.register("stabilizer_be", () ->
                    BlockEntityType.Builder.of(StabilizerBlockEntity::new,
                            ModBlocks.STABILZER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}