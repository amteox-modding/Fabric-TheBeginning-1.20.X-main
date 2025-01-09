package net.amteox.thebeginning.datagen;

import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.PALE_LOG).log(ModBlocks.PALE_LOG).wood(ModBlocks.PALE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALE_LOG).log(ModBlocks.STRIPPED_PALE_LOG).wood(ModBlocks.STRIPPED_PALE_WOOD);
        BlockStateModelGenerator.BlockTexturePool palePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEGINNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEGINNIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEGINNIUM_MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_LEAVES);

//        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
//        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_STEM, BlockStateModelGenerator.TintType.NOT_TINTED);
//        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_ROOT, BlockStateModelGenerator.TintType.NOT_TINTED);
//        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_ROOTS, BlockStateModelGenerator.TintType.NOT_TINTED);
//        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);



        palePlanksPool.stairs(ModBlocks.PALE_STAIRS);
        palePlanksPool.slab(ModBlocks.PALE_SLAB);
        palePlanksPool.button(ModBlocks.PALE_BUTTON);
        palePlanksPool.pressurePlate(ModBlocks.PALE_PRESSURE_PLATE);
        palePlanksPool.fence(ModBlocks.PALE_FENCE);
        palePlanksPool.fenceGate(ModBlocks.PALE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PALE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALE_TRAPDOOR);

//        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BEGINNING_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEGINNING_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEGINNING_SHARD, Models.GENERATED);
    }
}
