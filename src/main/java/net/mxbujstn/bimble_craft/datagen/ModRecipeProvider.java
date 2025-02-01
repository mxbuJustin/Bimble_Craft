package net.mxbujstn.bimble_craft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.mxbujstn.bimble_craft.BimbleCraft;
import net.mxbujstn.bimble_craft.block.ModBlocks;
import net.mxbujstn.bimble_craft.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> BIMBLE_SMELTABLES = List.of(ModItems.RAW_STABLE_BIMBLE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, BIMBLE_SMELTABLES, RecipeCategory.MISC, ModItems.BIMBLE_INGOT.get(), 0.5F, 600, "bimble_ingot");
        oreBlasting(pWriter, BIMBLE_SMELTABLES, RecipeCategory.MISC, ModItems.BIMBLE_INGOT.get(), 0.5F, 200, "bimble_ingot");

        // Shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIMBLE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BIMBLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BIMBLE_INGOT.get()), has(ModItems.BIMBLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BIMBLE_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RAW_STABLE_BIMBLE_ORE.get())
                .unlockedBy(getHasName(ModItems.RAW_STABLE_BIMBLE_ORE.get()), has(ModItems.RAW_STABLE_BIMBLE_ORE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_STICK.get())
                .pattern("   ")
                .pattern(" N ")
                .pattern(" N ")
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIMBLE_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('B', ModBlocks.BIMBLE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BIMBLE_BLOCK.get()), has(ModBlocks.BIMBLE_BLOCK.get()))
                .define('A', Items.ENCHANTED_GOLDEN_APPLE)
                .unlockedBy(getHasName(Items.ENCHANTED_GOLDEN_APPLE), has(Items.ENCHANTED_GOLDEN_APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIMBLE_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" N ")
                .define('B', ModItems.BIMBLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BIMBLE_INGOT.get()), has(ModItems.BIMBLE_INGOT.get()))
                .define('N', ModItems.NETHERITE_STICK.get())
                .unlockedBy(getHasName(ModItems.NETHERITE_STICK.get()), has(ModItems.NETHERITE_STICK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIMBLE_Pickaxe.get())
                .pattern("BBB")
                .pattern(" N ")
                .pattern(" N ")
                .define('B', ModItems.BIMBLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BIMBLE_INGOT.get()), has(ModItems.BIMBLE_INGOT.get()))
                .define('N', ModItems.NETHERITE_STICK.get())
                .unlockedBy(getHasName(ModItems.NETHERITE_STICK.get()), has(ModItems.NETHERITE_STICK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIMBLE_AXE.get())
                .pattern(" BB")
                .pattern(" NB")
                .pattern(" N ")
                .define('B', ModItems.BIMBLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BIMBLE_INGOT.get()), has(ModItems.BIMBLE_INGOT.get()))
                .define('N', ModItems.NETHERITE_STICK.get())
                .unlockedBy(getHasName(ModItems.NETHERITE_STICK.get()), has(ModItems.NETHERITE_STICK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIMBLE_SHOVEL.get())
                .pattern(" B ")
                .pattern(" N ")
                .pattern(" N ")
                .define('B', ModItems.BIMBLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BIMBLE_INGOT.get()), has(ModItems.BIMBLE_INGOT.get()))
                .define('N', ModItems.NETHERITE_STICK.get())
                .unlockedBy(getHasName(ModItems.NETHERITE_STICK.get()), has(ModItems.NETHERITE_STICK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIMBLE_HOE.get())
                .pattern(" BB")
                .pattern(" N ")
                .pattern(" N ")
                .define('B', ModItems.BIMBLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BIMBLE_INGOT.get()), has(ModItems.BIMBLE_INGOT.get()))
                .define('N', ModItems.NETHERITE_STICK.get())
                .unlockedBy(getHasName(ModItems.NETHERITE_STICK.get()), has(ModItems.NETHERITE_STICK.get()))
                .save(pWriter);


        

        // Shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BIMBLE_INGOT.get(), 9)
                .requires(ModBlocks.BIMBLE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BIMBLE_BLOCK.get()), has(ModBlocks.BIMBLE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_STABLE_BIMBLE_ORE.get(), 9)
                .requires(ModBlocks.RAW_BIMBLE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BIMBLE_BLOCK.get()), has(ModBlocks.RAW_BIMBLE_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, BimbleCraft.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}
