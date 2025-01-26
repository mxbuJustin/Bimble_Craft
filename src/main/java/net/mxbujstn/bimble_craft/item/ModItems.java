package net.mxbujstn.bimble_craft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mxbujstn.bimble_craft.BimbleCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BimbleCraft.MODID);

    public static final RegistryObject<Item> BIMBLE_INGOT = ITEMS.register("bimble_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STABLE_BIMBLE_ORE = ITEMS.register("raw_stable_bimble_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_UNSTABLE_BIMBLE_ORE = ITEMS.register("raw_unstable_bimble_ore",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
