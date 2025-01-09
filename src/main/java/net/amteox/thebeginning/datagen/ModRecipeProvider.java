package net.amteox.thebeginning.datagen;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEGINNING_INGOT,9)
                .input(ModBlocks.BEGINNIUM_BLOCK)
                .criterion(hasItem(ModBlocks.BEGINNIUM_BLOCK),conditionsFromItem(ModBlocks.BEGINNIUM_BLOCK))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "beginnium_ingot_from_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEGINNING_INGOT,1)
                .pattern("SDS")
                .pattern("DPD")
                .pattern("SDS")
                .input('S', ModItems.BEGINNING_SHARD)
                .input('D', ModItems.BEGINNING_DUST)
                .input('P', Items.ENDER_PEARL)
                .criterion(hasItem(ModItems.BEGINNING_SHARD),conditionsFromItem(ModItems.BEGINNING_SHARD))
                .offerTo(exporter, Identifier.of(TheBeginning.MOD_ID, "enderium_ingot_from_shard"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEGINNIUM_BLOCK,1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.BEGINNING_INGOT)
                .criterion(hasItem(ModItems.BEGINNING_INGOT),conditionsFromItem(ModItems.BEGINNING_INGOT))
                .offerTo(exporter);



//        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_SWORD,1)
//                .pattern(" E ")
//                .pattern(" E ")
//                .pattern(" S ")
//                .input('E', ModItems.ENDERIUM_INGOT)
//                .input('S', Items.STICK)
//                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
//                .offerTo(exporter);
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_PICKAXE,1)
//                .pattern("EEE")
//                .pattern(" S ")
//                .pattern(" S ")
//                .input('E', ModItems.ENDERIUM_INGOT)
//                .input('S', Items.STICK)
//                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
//                .offerTo(exporter);
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_AXE,1)
//                .pattern(" EE")
//                .pattern(" SE")
//                .pattern(" S ")
//                .input('E', ModItems.ENDERIUM_INGOT)
//                .input('S', Items.STICK)
//                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
//                .offerTo(exporter);
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_SHOVEL,1)
//                .pattern(" E ")
//                .pattern(" S ")
//                .pattern(" S ")
//                .input('E', ModItems.ENDERIUM_INGOT)
//                .input('S', Items.STICK)
//                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
//                .offerTo(exporter);
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_HOE,1)
//                .pattern(" EE")
//                .pattern(" S ")
//                .pattern(" S ")
//                .input('E', ModItems.ENDERIUM_INGOT)
//                .input('S', Items.STICK)
//                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
//                .offerTo(exporter);


        //WOOD


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK,4)
                .pattern("R")
                .pattern("R")
                .input('R', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BOWL)
                .pattern("X X")
                .pattern(" X ")
                .input('X', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_WOOD,3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.PALE_LOG)
                .criterion(hasItem(ModBlocks.PALE_LOG),conditionsFromItem(ModBlocks.PALE_LOG))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_PALE_WOOD,3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.STRIPPED_PALE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PALE_LOG),conditionsFromItem(ModBlocks.STRIPPED_PALE_LOG))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceRecipe(ModBlocks.PALE_FENCE, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceGateRecipe(ModBlocks.PALE_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlocks.PALE_STAIRS, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_SLAB, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

//        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALE_BUTTON)
//                .pattern("X")
//                .input('X', ModBlocks.PALE_PLANKS)
//                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
//                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALE_BUTTON);


        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALE_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createDoorRecipe(ModBlocks.PALE_DOOR, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createTrapdoorRecipe(ModBlocks.PALE_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);


    }
}

