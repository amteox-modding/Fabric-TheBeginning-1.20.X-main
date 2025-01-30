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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEGINNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEGINNIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEGINNIUM_MAGIC_BLOCK);


        blockStateModelGenerator.registerLog(ModBlocks.PALE_LOG).log(ModBlocks.PALE_LOG).wood(ModBlocks.PALE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALE_LOG).log(ModBlocks.STRIPPED_PALE_LOG).wood(ModBlocks.STRIPPED_PALE_WOOD);
        BlockStateModelGenerator.BlockTexturePool palePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_LEAVES);
        palePlanksPool.stairs(ModBlocks.PALE_STAIRS);
        palePlanksPool.slab(ModBlocks.PALE_SLAB);
        palePlanksPool.button(ModBlocks.PALE_BUTTON);
        palePlanksPool.pressurePlate(ModBlocks.PALE_PRESSURE_PLATE);
        palePlanksPool.fence(ModBlocks.PALE_FENCE);
        palePlanksPool.fenceGate(ModBlocks.PALE_FENCE_GATE);

        palePlanksPool.family(ModBlocks.PALE_FAMILY);

        blockStateModelGenerator.registerDoor(ModBlocks.PALE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALE_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);



        //YELLOWNESS

        blockStateModelGenerator.registerLog(ModBlocks.YELLOWNESS_LOG).log(ModBlocks.YELLOWNESS_LOG).wood(ModBlocks.YELLOWNESS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_YELLOWNESS_LOG).log(ModBlocks.STRIPPED_YELLOWNESS_LOG).wood(ModBlocks.STRIPPED_YELLOWNESS_WOOD);
        BlockStateModelGenerator.BlockTexturePool yellownessPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOWNESS_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOWNESS_LEAVES);
        yellownessPlanksPool.stairs(ModBlocks.YELLOWNESS_STAIRS);
        yellownessPlanksPool.slab(ModBlocks.YELLOWNESS_SLAB);
        yellownessPlanksPool.button(ModBlocks.YELLOWNESS_BUTTON);
        yellownessPlanksPool.pressurePlate(ModBlocks.YELLOWNESS_PRESSURE_PLATE);
        yellownessPlanksPool.fence(ModBlocks.YELLOWNESS_FENCE);
        yellownessPlanksPool.fenceGate(ModBlocks.YELLOWNESS_FENCE_GATE);

        yellownessPlanksPool.family(ModBlocks.YELLOWNESS_FAMILY);

        blockStateModelGenerator.registerDoor(ModBlocks.YELLOWNESS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.YELLOWNESS_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.YELLOWNESS_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        //PURPLENESS

        blockStateModelGenerator.registerLog(ModBlocks.PURPLENESS_LOG).log(ModBlocks.PURPLENESS_LOG).wood(ModBlocks.PURPLENESS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PURPLENESS_LOG).log(ModBlocks.STRIPPED_PURPLENESS_LOG).wood(ModBlocks.STRIPPED_PURPLENESS_WOOD);
        BlockStateModelGenerator.BlockTexturePool purplenessPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLENESS_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLENESS_LEAVES);
        purplenessPlanksPool.stairs(ModBlocks.PURPLENESS_STAIRS);
        purplenessPlanksPool.slab(ModBlocks.PURPLENESS_SLAB);
        purplenessPlanksPool.button(ModBlocks.PURPLENESS_BUTTON);
        purplenessPlanksPool.pressurePlate(ModBlocks.PURPLENESS_PRESSURE_PLATE);
        purplenessPlanksPool.fence(ModBlocks.PURPLENESS_FENCE);
        purplenessPlanksPool.fenceGate(ModBlocks.PURPLENESS_FENCE_GATE);

        purplenessPlanksPool.family(ModBlocks.PURPLENESS_FAMILY);

        blockStateModelGenerator.registerDoor(ModBlocks.PURPLENESS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PURPLENESS_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.PURPLENESS_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);





    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BEGINNING_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEGINNING_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEGINNING_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_PALE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALE_CHEST_BOAT, Models.GENERATED);

        //YELLOWNESS

        itemModelGenerator.register(ModItems.HANGING_YELLOWNESS_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOWNESS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOWNESS_CHEST_BOAT, Models.GENERATED);

        //PURPLENESS

        itemModelGenerator.register(ModItems.HANGING_PURPLENESS_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLENESS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLENESS_CHEST_BOAT, Models.GENERATED);
    }
}
