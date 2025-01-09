package net.amteox.thebeginning.block;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.custom.MagicBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block BEGINNIUM_BLOCK = registerBlock("beginnium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block BEGINNIUM_MAGIC_BLOCK = registerBlock("beginnium_magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BEGINNIUM_ORE = registerBlock("beginnium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_LOG = registerBlock("pale_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block PALE_WOOD = registerBlock("pale_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block STRIPPED_PALE_LOG = registerBlock("stripped_pale_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block STRIPPED_PALE_WOOD = registerBlock("stripped_pale_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block PALE_PLANKS = registerBlock("pale_planks",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f).sounds((BlockSoundGroup.WOOD))));

    //Wyroby

    public static final Block PALE_STAIRS = registerBlock("pale_stairs",
            new StairsBlock(ModBlocks.PALE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_SLAB = registerBlock("pale_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));


    public static final Block PALE_BUTTON = registerBlock("pale_button",
            new ButtonBlock(AbstractBlock.Settings.create()
                    .strength(2f).requiresTool().noCollision().sounds(BlockSoundGroup.WOOD), BlockSetType.IRON, 5, true));

    public static final Block PALE_PRESSURE_PLATE = registerBlock("pale_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.create()
                            .strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));


    public static final Block PALE_FENCE = registerBlock("pale_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_FENCE_GATE = registerBlock("pale_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));


    public static final Block PALE_DOOR = registerBlock("pale_door",
            new DoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD),
                    BlockSetType.ACACIA));

    public static final Block PALE_TRAPDOOR = registerBlock("pale_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Block PALE_LEAVES = registerBlock("pale_leaves",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES)));

//    public static final Block PALE_GRASS = registerBlock("pale_grass",
//            new PaleCrops(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
//
//    public static final Block PALE_STEM = registerBlock("pale_stem",
//            new PaleCrops(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
//
//    public static final Block PALE_ROOT = registerBlock("pale_root",
//            new PaleCrops( AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
//
//    public static final Block PALE_BUSH = registerBlock("pale_bush",
//            new PaleCrops(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
//
//    public static final Block PALE_ROOTS = registerBlock("pale_roots",
//            new PaleCrops( AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));




    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, name), block);
    }



    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(TheBeginning.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }



    public static void registerModBlocks()
    {
        TheBeginning.LOGGER.info("Registering Modblocks for: " + TheBeginning.MOD_ID);
    }

}
