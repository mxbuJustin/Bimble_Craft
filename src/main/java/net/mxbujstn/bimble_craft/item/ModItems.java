package net.mxbujstn.bimble_craft.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.item.custom.BimbleOreDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BimbleCraft.MODID);

    public static final RegistryObject<Item> BIMBLE_INGOT = ITEMS.register("bimble_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STABLE_BIMBLE_ORE = ITEMS.register("raw_stable_bimble_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_UNSTABLE_BIMBLE_ORE = ITEMS.register("raw_unstable_bimble_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_DETECTOR = ITEMS.register("bimble_detector",
            () -> new BimbleOreDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> NETHERITE_STICK = ITEMS.register("netherite_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_APPLE = ITEMS.register("bimble_apple",
            () -> new Item(new Item.Properties().food(ModFoods.BIMBLE_APPLE)));
    public static final RegistryObject<Item> BIMBLE_GUN = ITEMS.register("bimble_gun",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BIMBLE_SWORD = ITEMS.register("bimble_sword",
            () -> new SwordItem(ModToolTiers.Bimble, 8, 2,new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_Pickaxe = ITEMS.register("bimble_pickaxe",
            () -> new PickaxeItem(ModToolTiers.Bimble, 3, 3,new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_AXE = ITEMS.register("bimble_axe",
            () -> new AxeItem(ModToolTiers.Bimble, 9, 0,new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_SHOVEL = ITEMS.register("bimble_shovel",
            () -> new ShovelItem(ModToolTiers.Bimble, 2, 1,new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_HOE = ITEMS.register("bimble_hoe",
            () -> new HoeItem(ModToolTiers.Bimble, 0, 0,new Item.Properties()));

    public static final RegistryObject<Item> BIMBLE_HELMET = ITEMS.register("bimble_helmet",
            () -> new ArmorItem(ModArmorMaterials.BIMBLE, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_CHESTPLATE = ITEMS.register("bimble_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BIMBLE, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_LEGGINGS = ITEMS.register("bimble_leggings",
            () -> new ArmorItem(ModArmorMaterials.BIMBLE, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BIMBLE_BOOTS = ITEMS.register("bimble_boots",
            () -> new ArmorItem(ModArmorMaterials.BIMBLE, ArmorItem.Type.BOOTS,new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
