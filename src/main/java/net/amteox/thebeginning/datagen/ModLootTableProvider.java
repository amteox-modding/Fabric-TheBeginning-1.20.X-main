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
        addDrop(ModBlocks.BEGINNIUM_BLOCK);
        addDrop(ModBlocks.PALE_LOG);
        addDrop(ModBlocks.PALE_WOOD);
        addDrop(ModBlocks.STRIPPED_PALE_LOG);
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


    }
}
