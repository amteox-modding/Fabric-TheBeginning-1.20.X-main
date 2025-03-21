package net.amteox.thebeginning.datagen;

import net.amteox.thebeginning.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BEGINNIUM_BLOCK);
        addDrop(ModBlocks.BEGINNIUM_ORE);
        addDrop(ModBlocks.PALE_LOG);
        addDrop(ModBlocks.PALE_WOOD);
        addDrop(ModBlocks.STRIPPED_PALE_LOG);
        addDrop(ModBlocks.PALE_PLANKS);
        addDrop(ModBlocks.BEGINNIUM_MAGIC_BLOCK);
        addDrop(ModBlocks.PALE_STAIRS);
        addDrop(ModBlocks.PALE_SLAB, slabDrops(ModBlocks.PALE_SLAB));
        addDrop(ModBlocks.PALE_BUTTON);
        addDrop(ModBlocks.PALE_PRESSURE_PLATE);
        addDrop(ModBlocks.PALE_FENCE);
        addDrop(ModBlocks.PALE_FENCE_GATE);
        addDrop(ModBlocks.PALE_DOOR, doorDrops(ModBlocks.PALE_DOOR));
        addDrop(ModBlocks.PALE_TRAPDOOR);
        addDrop(ModBlocks.PALE_SAPLING);
        addDrop(ModBlocks.PALE_LEAVES, leavesDrops(ModBlocks.PALE_LEAVES, ModBlocks.PALE_SAPLING, 0.0625f));
        addDrop(ModBlocks.BEGINNIUM_BLOCK);
        addDrop(ModBlocks.BEGINNIUM_ORE);



        //YELLOWNESS

        addDrop(ModBlocks.YELLOWNESS_LOG);
        addDrop(ModBlocks.YELLOWNESS_WOOD);
        addDrop(ModBlocks.STRIPPED_YELLOWNESS_LOG);
        addDrop(ModBlocks.YELLOWNESS_PLANKS);
        addDrop(ModBlocks.YELLOWNESS_STAIRS);
        addDrop(ModBlocks.YELLOWNESS_SLAB, slabDrops(ModBlocks.YELLOWNESS_SLAB));
        addDrop(ModBlocks.YELLOWNESS_BUTTON);
        addDrop(ModBlocks.YELLOWNESS_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOWNESS_FENCE);
        addDrop(ModBlocks.YELLOWNESS_FENCE_GATE);
        addDrop(ModBlocks.YELLOWNESS_DOOR, doorDrops(ModBlocks.YELLOWNESS_DOOR));
        addDrop(ModBlocks.YELLOWNESS_TRAPDOOR);
        addDrop(ModBlocks.YELLOWNESS_LEAVES, leavesDrops(ModBlocks.YELLOWNESS_LEAVES, ModBlocks.YELLOWNESS_SAPLING, 0.0625f));


        //PURPLENESS

        addDrop(ModBlocks.PURPLENESS_LOG);
        addDrop(ModBlocks.PURPLENESS_WOOD);
        addDrop(ModBlocks.STRIPPED_PURPLENESS_LOG);
        addDrop(ModBlocks.PURPLENESS_PLANKS);
        addDrop(ModBlocks.PURPLENESS_STAIRS);
        addDrop(ModBlocks.PURPLENESS_SLAB, slabDrops(ModBlocks.PURPLENESS_SLAB));
        addDrop(ModBlocks.PURPLENESS_BUTTON);
        addDrop(ModBlocks.PURPLENESS_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLENESS_FENCE);
        addDrop(ModBlocks.PURPLENESS_FENCE_GATE);
        addDrop(ModBlocks.PURPLENESS_DOOR, doorDrops(ModBlocks.PURPLENESS_DOOR));
        addDrop(ModBlocks.PURPLENESS_TRAPDOOR);
        addDrop(ModBlocks.PURPLENESS_LEAVES, leavesDrops(ModBlocks.PURPLENESS_LEAVES, ModBlocks.PURPLENESS_SAPLING, 0.0625f));

        //STONIUM

        addDrop(ModBlocks.STONIUM);
        addDrop(ModBlocks.STONIUM_STAIRS);
        addDrop(ModBlocks.STONIUM_SLAB, slabDrops(ModBlocks.STONIUM_SLAB));
        addDrop(ModBlocks.STONIUM_BUTTON);
        addDrop(ModBlocks.STONIUM_PRESSURE_PLATE);
        addDrop(ModBlocks.STONIUM_WALL);


        addDrop(ModBlocks.STONIUM_BRICKS);
        addDrop(ModBlocks.STONIUM_BRICKS_STAIRS);
        addDrop(ModBlocks.STONIUM_BRICKS_SLAB, slabDrops(ModBlocks.STONIUM_BRICKS_SLAB));
        addDrop(ModBlocks.STONIUM_BRICKS_BUTTON);
        addDrop(ModBlocks.STONIUM_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks.STONIUM_BRICKS_WALL);

        addDrop(ModBlocks.MOSSY_STONIUM);
        addDrop(ModBlocks.MOSSY_STONIUM_STAIRS);
        addDrop(ModBlocks.MOSSY_STONIUM_SLAB, slabDrops(ModBlocks.STONIUM_SLAB));
        addDrop(ModBlocks.MOSSY_STONIUM_BUTTON);
        addDrop(ModBlocks.MOSSY_STONIUM_PRESSURE_PLATE);
        addDrop(ModBlocks.MOSSY_STONIUM_WALL);

        addDrop(ModBlocks.MOSSY_STONIUM_BRICKS);
        addDrop(ModBlocks.MOSSY_STONIUM_BRICKS_STAIRS);
        addDrop(ModBlocks.MOSSY_STONIUM_BRICKS_SLAB, slabDrops(ModBlocks.MOSSY_STONIUM_BRICKS_SLAB));
        addDrop(ModBlocks.MOSSY_STONIUM_BRICKS_BUTTON);
        addDrop(ModBlocks.MOSSY_STONIUM_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks.MOSSY_STONIUM_BRICKS_WALL);



    }
}
