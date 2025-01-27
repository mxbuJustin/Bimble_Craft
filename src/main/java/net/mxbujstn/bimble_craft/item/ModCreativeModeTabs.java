package net.mxbujstn.bimble_craft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BimbleCraft.MODID);

    public static final RegistryObject<CreativeModeTab> BIMBLE_CRAFT_TAB = CREATIVE_MODE_TABS.register("bimble_craft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BIMBLE_INGOT.get()))
                    .title(Component.translatable("creativetab.bimble_craft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BIMBLE_INGOT.get());
                        pOutput.accept(ModItems.RAW_STABLE_BIMBLE_ORE.get());
                        pOutput.accept(ModItems.RAW_UNSTABLE_BIMBLE_ORE.get());
                        pOutput.accept(ModItems.BIMBLE_DETECTOR.get());

                        pOutput.accept(ModBlocks.BIMBLE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_BIMBLE_BLOCK.get());
                        pOutput.accept(ModBlocks.BIMBLE_ORE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
