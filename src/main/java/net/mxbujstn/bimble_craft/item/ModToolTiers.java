package net.mxbujstn.bimble_craft.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier Bimble = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2561, 12f, 5f, 25,
                    ModTags.Blocks.NEEDS_BIMBLE_TOOL, () -> Ingredient.of(ModItems.BIMBLE_INGOT.get())),
            new ResourceLocation(BimbleCraft.MODID, "bimble"), List.of(Tiers.NETHERITE), List.of());

}
