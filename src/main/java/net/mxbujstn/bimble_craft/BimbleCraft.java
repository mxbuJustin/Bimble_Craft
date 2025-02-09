package net.mxbujstn.bimble_craft;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mxbujstn.bimble_craft.block.ModBlocks;
import net.mxbujstn.bimble_craft.block.entity.ModBlockEntities;
import net.mxbujstn.bimble_craft.item.ModCreativeModeTabs;
import net.mxbujstn.bimble_craft.item.ModItems;
import net.mxbujstn.bimble_craft.item.custom.BimbleOreDetectorItem;
import net.mxbujstn.bimble_craft.loot.ModLootModifiers;
import net.mxbujstn.bimble_craft.screen.ModMenuTypes;
import net.mxbujstn.bimble_craft.screen.StabilizerScreen;
import org.slf4j.Logger;

@Mod(BimbleCraft.MODID)
public class BimbleCraft
{

    public static final String MODID = "bimble_craft";

   // private static final Logger LOGGER = LogUtils.getLogger();

    public BimbleCraft(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BIMBLE_INGOT);
            event.accept(ModItems.RAW_STABLE_BIMBLE_ORE);
            event.accept(ModItems.RAW_UNSTABLE_BIMBLE_ORE);
        }


    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            MenuScreens.register(ModMenuTypes.STABILIZER_MENU.get(), StabilizerScreen::new);
        }
    }

}
