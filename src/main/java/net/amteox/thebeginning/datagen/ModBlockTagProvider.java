package net.amteox.thebeginning.datagen;

import net.amteox.thebeginning.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BEGINNIUM_ORE)
                .add(ModBlocks.BEGINNIUM_BLOCK)
                .add(ModBlocks.BEGINNIUM_MAGIC_BLOCK);

        // PALE WOOD
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.PALE_LEAVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PALE_LOG)
                .add(ModBlocks.STRIPPED_PALE_LOG)
                .add(ModBlocks.PALE_WOOD)
                .add(ModBlocks.STRIPPED_PALE_WOOD)
                .add(ModBlocks.PALE_PLANKS)
                .add(ModBlocks.PALE_DOOR)
                .add(ModBlocks.PALE_TRAPDOOR)
                .add(ModBlocks.PALE_STAIRS)
                .add(ModBlocks.PALE_SLAB)
                .add(ModBlocks.WALL_PALE_SIGN)
                .add(ModBlocks.HANGING_PALE_SIGN)
                .add(ModBlocks.WALL_HANGING_PALE_SIGN)
                .add(ModBlocks.PALE_BUTTON)
                .add(ModBlocks.PALE_PRESSURE_PLATE);




        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALE_LOG)
                .add(ModBlocks.STRIPPED_PALE_LOG)
                .add(ModBlocks.PALE_WOOD)
                .add(ModBlocks.STRIPPED_PALE_WOOD)
                .add(ModBlocks.PALE_PLANKS)
                .add(ModBlocks.PALE_DOOR)
                .add(ModBlocks.PALE_TRAPDOOR)
                .add(ModBlocks.PALE_STAIRS)
                .add(ModBlocks.PALE_SLAB)
                .add(ModBlocks.WALL_PALE_SIGN)
                .add(ModBlocks.HANGING_PALE_SIGN)
                .add(ModBlocks.WALL_HANGING_PALE_SIGN)
                .add(ModBlocks.PALE_BUTTON)
                .add(ModBlocks.PALE_PRESSURE_PLATE);


        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.PALE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PALE_FENCE_GATE);

        // YELLOWNESS
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.YELLOWNESS_LEAVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.YELLOWNESS_LOG)
                .add(ModBlocks.STRIPPED_YELLOWNESS_LOG)
                .add(ModBlocks.YELLOWNESS_WOOD)
                .add(ModBlocks.STRIPPED_YELLOWNESS_WOOD)
                .add(ModBlocks.YELLOWNESS_PLANKS)
                .add(ModBlocks.YELLOWNESS_DOOR)
                .add(ModBlocks.YELLOWNESS_TRAPDOOR)
                .add(ModBlocks.YELLOWNESS_STAIRS)
                .add(ModBlocks.YELLOWNESS_SLAB)
                .add(ModBlocks.WALL_YELLOWNESS_SIGN)
                .add(ModBlocks.HANGING_YELLOWNESS_SIGN)
                .add(ModBlocks.WALL_HANGING_YELLOWNESS_SIGN)
                .add(ModBlocks.YELLOWNESS_BUTTON)
                .add(ModBlocks.YELLOWNESS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.YELLOWNESS_LOG)
                .add(ModBlocks.STRIPPED_YELLOWNESS_LOG)
                .add(ModBlocks.YELLOWNESS_WOOD)
                .add(ModBlocks.STRIPPED_YELLOWNESS_WOOD)
                .add(ModBlocks.YELLOWNESS_PLANKS)
                .add(ModBlocks.YELLOWNESS_DOOR)
                .add(ModBlocks.YELLOWNESS_TRAPDOOR)
                .add(ModBlocks.YELLOWNESS_STAIRS)
                .add(ModBlocks.YELLOWNESS_SLAB)
                .add(ModBlocks.WALL_YELLOWNESS_SIGN)
                .add(ModBlocks.HANGING_YELLOWNESS_SIGN)
                .add(ModBlocks.WALL_HANGING_YELLOWNESS_SIGN)
                .add(ModBlocks.YELLOWNESS_BUTTON)
                .add(ModBlocks.YELLOWNESS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.YELLOWNESS_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.YELLOWNESS_FENCE_GATE);

        // PURPLENESS
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.PURPLENESS_LEAVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PURPLENESS_LOG)
                .add(ModBlocks.STRIPPED_PURPLENESS_LOG)
                .add(ModBlocks.PURPLENESS_WOOD)
                .add(ModBlocks.STRIPPED_PURPLENESS_WOOD)
                .add(ModBlocks.PURPLENESS_PLANKS)
                .add(ModBlocks.PURPLENESS_DOOR)
                .add(ModBlocks.PURPLENESS_TRAPDOOR)
                .add(ModBlocks.PURPLENESS_STAIRS)
                .add(ModBlocks.PURPLENESS_SLAB)
                .add(ModBlocks.WALL_PURPLENESS_SIGN)
                .add(ModBlocks.HANGING_PURPLENESS_SIGN)
                .add(ModBlocks.WALL_HANGING_PURPLENESS_SIGN)
                .add(ModBlocks.PURPLENESS_BUTTON)
                .add(ModBlocks.PURPLENESS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PURPLENESS_LOG)
                .add(ModBlocks.STRIPPED_PURPLENESS_LOG)
                .add(ModBlocks.PURPLENESS_WOOD)
                .add(ModBlocks.STRIPPED_PURPLENESS_WOOD)
                .add(ModBlocks.PURPLENESS_PLANKS)
                .add(ModBlocks.PURPLENESS_DOOR)
                .add(ModBlocks.PURPLENESS_TRAPDOOR)
                .add(ModBlocks.PURPLENESS_STAIRS)
                .add(ModBlocks.PURPLENESS_SLAB)
                .add(ModBlocks.WALL_PURPLENESS_SIGN)
                .add(ModBlocks.HANGING_PURPLENESS_SIGN)
                .add(ModBlocks.WALL_HANGING_PURPLENESS_SIGN)
                .add(ModBlocks.PURPLENESS_BUTTON)
                .add(ModBlocks.PURPLENESS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.PURPLENESS_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PURPLENESS_FENCE_GATE);


        //STONIUM

       getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
               .add(ModBlocks.STONIUM)
               .add(ModBlocks.MOSSY_STONIUM)
               .add(ModBlocks.STONIUM_BRICKS)
               .add(ModBlocks.MOSSY_STONIUM_BRICKS)
               .add(ModBlocks.STONIUM_STAIRS)
               .add(ModBlocks.STONIUM_SLAB)
               .add(ModBlocks.STONIUM_BUTTON)
               .add(ModBlocks.STONIUM_PRESSURE_PLATE)
               .add(ModBlocks.STONIUM_WALL)
               .add(ModBlocks.MOSSY_STONIUM_STAIRS)
               .add(ModBlocks.MOSSY_STONIUM_SLAB)
               .add(ModBlocks.MOSSY_STONIUM_BUTTON)
               .add(ModBlocks.MOSSY_STONIUM_PRESSURE_PLATE)
               .add(ModBlocks.MOSSY_STONIUM_WALL)
               .add(ModBlocks.STONIUM_BRICKS_STAIRS)
               .add(ModBlocks.STONIUM_BRICKS_SLAB)
               .add(ModBlocks.STONIUM_BRICKS_BUTTON)
               .add(ModBlocks.STONIUM_BRICKS_PRESSURE_PLATE)
               .add(ModBlocks.STONIUM_BRICKS_WALL)
               .add(ModBlocks.MOSSY_STONIUM_BRICKS_STAIRS)
               .add(ModBlocks.MOSSY_STONIUM_BRICKS_SLAB)
               .add(ModBlocks.MOSSY_STONIUM_BRICKS_BUTTON)
               .add(ModBlocks.MOSSY_STONIUM_BRICKS_PRESSURE_PLATE)
               .add(ModBlocks.MOSSY_STONIUM_BRICKS_WALL);


    }
}
