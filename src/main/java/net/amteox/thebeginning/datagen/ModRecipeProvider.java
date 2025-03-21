package net.amteox.thebeginning.datagen;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEGINNING_INGOT, 9)
                .input(ModBlocks.BEGINNIUM_BLOCK)
                .criterion(hasItem(ModBlocks.BEGINNIUM_BLOCK), conditionsFromItem(ModBlocks.BEGINNIUM_BLOCK))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "beginnium_ingot_from_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEGINNING_INGOT, 1)
                .pattern("SDS")
                .pattern("DPD")
                .pattern("SDS")
                .input('S', ModItems.BEGINNING_SHARD)
                .input('D', ModItems.BEGINNING_DUST)
                .input('P', Items.ENDER_PEARL)
                .criterion(hasItem(ModItems.BEGINNING_SHARD), conditionsFromItem(ModItems.BEGINNING_SHARD))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "begginnium_ingot_from_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEGINNIUM_BLOCK, 1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.BEGINNING_INGOT)
                .criterion(hasItem(ModItems.BEGINNING_INGOT), conditionsFromItem(ModItems.BEGINNING_INGOT))
                .offerTo(exporter);

        // WOOD RECIPES

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK, 4)
                .pattern("R")
                .pattern("R")
                .input('R', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BOWL)
                .pattern("X X")
                .pattern(" X ")
                .input('X', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.PALE_LOG)
                .criterion(hasItem(ModBlocks.PALE_LOG), conditionsFromItem(ModBlocks.PALE_LOG))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_PALE_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.STRIPPED_PALE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PALE_LOG), conditionsFromItem(ModBlocks.STRIPPED_PALE_LOG))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceRecipe(ModBlocks.PALE_FENCE, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceGateRecipe(ModBlocks.PALE_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlocks.PALE_STAIRS, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_SLAB, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALE_BUTTON)
                .input(ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALE_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createDoorRecipe(ModBlocks.PALE_DOOR, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createTrapdoorRecipe(ModBlocks.PALE_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS), conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);


        //YELLOWNESS

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK, 4)
                .pattern("R")
                .pattern("R")
                .input('R', ModBlocks.YELLOWNESS_PLANKS)
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "stick_from_yellowness"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BOWL)
                .pattern("X X")
                .pattern(" X ")
                .input('X', ModBlocks.YELLOWNESS_PLANKS)
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "bowl_from_yellowness"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOWNESS_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.YELLOWNESS_LOG)
                .criterion(hasItem(ModBlocks.YELLOWNESS_LOG), conditionsFromItem(ModBlocks.YELLOWNESS_LOG))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_YELLOWNESS_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.STRIPPED_YELLOWNESS_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_YELLOWNESS_LOG), conditionsFromItem(ModBlocks.STRIPPED_YELLOWNESS_LOG))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceRecipe(ModBlocks.YELLOWNESS_FENCE, Ingredient.ofItems(ModBlocks.YELLOWNESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceGateRecipe(ModBlocks.YELLOWNESS_FENCE_GATE, Ingredient.ofItems(ModBlocks.YELLOWNESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlocks.YELLOWNESS_STAIRS, Ingredient.ofItems(ModBlocks.YELLOWNESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOWNESS_SLAB, Ingredient.ofItems(ModBlocks.YELLOWNESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YELLOWNESS_BUTTON)
                .input(ModBlocks.YELLOWNESS_PLANKS)
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YELLOWNESS_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.YELLOWNESS_PLANKS)
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createDoorRecipe(ModBlocks.YELLOWNESS_DOOR, Ingredient.ofItems(ModBlocks.YELLOWNESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createTrapdoorRecipe(ModBlocks.YELLOWNESS_TRAPDOOR, Ingredient.ofItems(ModBlocks.YELLOWNESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.YELLOWNESS_PLANKS), conditionsFromItem(ModBlocks.YELLOWNESS_PLANKS))
                .offerTo(exporter);

        //PURPLENESS

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK, 4)
                .pattern("R")
                .pattern("R")
                .input('R', ModBlocks.PURPLENESS_PLANKS)
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "stick_from_purpleness"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BOWL)
                .pattern("X X")
                .pattern(" X ")
                .input('X', ModBlocks.PURPLENESS_PLANKS)
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "bowl_from_purpleness"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLENESS_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.PURPLENESS_LOG)
                .criterion(hasItem(ModBlocks.PURPLENESS_LOG), conditionsFromItem(ModBlocks.PURPLENESS_LOG))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_PURPLENESS_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.STRIPPED_PURPLENESS_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PURPLENESS_LOG), conditionsFromItem(ModBlocks.STRIPPED_PURPLENESS_LOG))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceRecipe(ModBlocks.PURPLENESS_FENCE, Ingredient.ofItems(ModBlocks.PURPLENESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceGateRecipe(ModBlocks.PURPLENESS_FENCE_GATE, Ingredient.ofItems(ModBlocks.PURPLENESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlocks.PURPLENESS_STAIRS, Ingredient.ofItems(ModBlocks.PURPLENESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLENESS_SLAB, Ingredient.ofItems(ModBlocks.PURPLENESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PURPLENESS_BUTTON)
                .input(ModBlocks.PURPLENESS_PLANKS)
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PURPLENESS_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.PURPLENESS_PLANKS)
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createDoorRecipe(ModBlocks.PURPLENESS_DOOR, Ingredient.ofItems(ModBlocks.PURPLENESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createTrapdoorRecipe(ModBlocks.PURPLENESS_TRAPDOOR, Ingredient.ofItems(ModBlocks.PURPLENESS_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PURPLENESS_PLANKS), conditionsFromItem(ModBlocks.PURPLENESS_PLANKS))
                .offerTo(exporter);

        //STONIUM

        FabricRecipeProvider.createStairsRecipe(ModBlocks.STONIUM_STAIRS, Ingredient.ofItems(ModBlocks.STONIUM.asItem()))
                .criterion(hasItem(ModBlocks.STONIUM), conditionsFromItem(ModBlocks.STONIUM))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONIUM_SLAB, Ingredient.ofItems(ModBlocks.STONIUM.asItem()))
                .criterion(hasItem(ModBlocks.STONIUM), conditionsFromItem(ModBlocks.STONIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONIUM_WALL)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.STONIUM)
                .criterion(hasItem(ModBlocks.STONIUM), conditionsFromItem(ModBlocks.STONIUM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONIUM_BUTTON)
                .input(ModBlocks.STONIUM)
                .criterion(hasItem(ModBlocks.STONIUM), conditionsFromItem(ModBlocks.STONIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONIUM_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.STONIUM)
                .criterion(hasItem(ModBlocks.STONIUM), conditionsFromItem(ModBlocks.STONIUM))
                .offerTo(exporter);

        //STONIUM BRICKS
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONIUM_BRICKS)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.STONIUM)
                .criterion(hasItem(ModBlocks.STONIUM), conditionsFromItem(ModBlocks.STONIUM))
                .offerTo(exporter);


        FabricRecipeProvider.createStairsRecipe(ModBlocks.STONIUM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.STONIUM_BRICKS.asItem()))
                .criterion(hasItem(ModBlocks.STONIUM_BRICKS), conditionsFromItem(ModBlocks.STONIUM_BRICKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONIUM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.STONIUM_BRICKS.asItem()))
                .criterion(hasItem(ModBlocks.STONIUM_BRICKS), conditionsFromItem(ModBlocks.STONIUM_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONIUM_BRICKS_WALL)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.STONIUM_BRICKS)
                .criterion(hasItem(ModBlocks.STONIUM_BRICKS), conditionsFromItem(ModBlocks.STONIUM_BRICKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONIUM_BRICKS_BUTTON)
                .input(ModBlocks.STONIUM_BRICKS)
                .criterion(hasItem(ModBlocks.STONIUM_BRICKS), conditionsFromItem(ModBlocks.STONIUM_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONIUM_BRICKS_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.STONIUM_BRICKS)
                .criterion(hasItem(ModBlocks.STONIUM_BRICKS), conditionsFromItem(ModBlocks.STONIUM_BRICKS))
                .offerTo(exporter);

        //MOSSY_STONIUM

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONIUM)
                .pattern("RX")
                .input('R', ModBlocks.STONIUM)
                .input('X', Blocks.MOSS_BLOCK)
                .criterion(hasItem(ModBlocks.STONIUM), conditionsFromItem(ModBlocks.STONIUM))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlocks.MOSSY_STONIUM_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_STONIUM.asItem()))
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM), conditionsFromItem(ModBlocks.MOSSY_STONIUM))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONIUM_SLAB, Ingredient.ofItems(ModBlocks.MOSSY_STONIUM.asItem()))
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM), conditionsFromItem(ModBlocks.MOSSY_STONIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONIUM_WALL)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.MOSSY_STONIUM)
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM), conditionsFromItem(ModBlocks.MOSSY_STONIUM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MOSSY_STONIUM_BUTTON)
                .input(ModBlocks.MOSSY_STONIUM)
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM), conditionsFromItem(ModBlocks.MOSSY_STONIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MOSSY_STONIUM_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.MOSSY_STONIUM)
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM), conditionsFromItem(ModBlocks.MOSSY_STONIUM))
                .offerTo(exporter);



        //MOSSY_STONIUM_BRICKS

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONIUM_BRICKS)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.MOSSY_STONIUM)
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM), conditionsFromItem(ModBlocks.MOSSY_STONIUM))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlocks.MOSSY_STONIUM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_STONIUM_BRICKS.asItem()))
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM_BRICKS), conditionsFromItem(ModBlocks.MOSSY_STONIUM_BRICKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONIUM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.MOSSY_STONIUM_BRICKS.asItem()))
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM_BRICKS), conditionsFromItem(ModBlocks.MOSSY_STONIUM_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONIUM_BRICKS_WALL)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.MOSSY_STONIUM_BRICKS)
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM_BRICKS), conditionsFromItem(ModBlocks.MOSSY_STONIUM_BRICKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MOSSY_STONIUM_BRICKS_BUTTON)
                .input(ModBlocks.MOSSY_STONIUM_BRICKS)
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM_BRICKS), conditionsFromItem(ModBlocks.MOSSY_STONIUM_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MOSSY_STONIUM_BRICKS_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.MOSSY_STONIUM_BRICKS)
                .criterion(hasItem(ModBlocks.MOSSY_STONIUM_BRICKS), conditionsFromItem(ModBlocks.MOSSY_STONIUM_BRICKS))
                .offerTo(exporter);










    }
}
