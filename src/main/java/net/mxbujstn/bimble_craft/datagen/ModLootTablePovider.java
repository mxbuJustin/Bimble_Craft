package net.mxbujstn.bimble_craft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.mxbujstn.bimble_craft.datagen.loot.ModBlockLootTables;

import java.util.List;
import java.util.Set;

public class ModLootTablePovider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ModBlockLootTables:: new, LootContextParamSets.BLOCK)
        ));
    }
}
