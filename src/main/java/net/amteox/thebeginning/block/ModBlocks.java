package net.amteox.thebeginning.block;



import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.custom.MagicBlock;
import net.amteox.thebeginning.world.tree.PaleSaplingGenerator;
import net.amteox.thebeginning.world.tree.PurplenessSaplingGenerator;
import net.amteox.thebeginning.world.tree.YellownessSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Materials
    public static final Block BEGINNIUM_BLOCK = registerBlock("beginnium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block BEGINNIUM_MAGIC_BLOCK = registerBlock("beginnium_magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    public static final Block BEGINNIUM_ORE = registerBlock("beginnium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.STONE)));

    //PALE!

    // Wood and Variants
    public static final Block PALE_LOG = registerBlock("pale_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_WOOD = registerBlock("pale_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_PALE_LOG = registerBlock("stripped_pale_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_PALE_WOOD = registerBlock("stripped_pale_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_PLANKS = registerBlock("pale_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f).sounds(BlockSoundGroup.WOOD)));

    // construction elements
    public static final Block PALE_STAIRS = registerBlock("pale_stairs",
            new StairsBlock(PALE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_SLAB = registerBlock("pale_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_FENCE = registerBlock("pale_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_FENCE_GATE = registerBlock("pale_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PALE_DOOR = registerBlock("pale_door",
            new DoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Block PALE_TRAPDOOR = registerBlock("pale_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Identifier PALE_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "entity/signs/pale");
    public static final Identifier PALE_HANGING_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "entity/signs/hanging/pale");
    public static final Identifier PALE_HANGING_GUI_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "textures/gui/hanging_signs/pale");

    public static final Block STANDING_PALE_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "pale_standing_sign"),
            new TerraformSignBlock(PALE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_PALE_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "pale_wall_sign"),
            new TerraformWallSignBlock(PALE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_PALE_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "pale_hanging_sign"),
            new TerraformHangingSignBlock(PALE_HANGING_SIGN_TEXTURE, PALE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_PALE_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "pale_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(PALE_HANGING_SIGN_TEXTURE,PALE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily PALE_FAMILY = BlockFamilies.register(ModBlocks.PALE_PLANKS)
            .sign(ModBlocks.STANDING_PALE_SIGN, ModBlocks.WALL_PALE_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    // Redstone
    public static final Block PALE_BUTTON = registerBlock("pale_button",
            new ButtonBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision().sounds(BlockSoundGroup.WOOD), BlockSetType.IRON, 5, true));

    public static final Block PALE_PRESSURE_PLATE = registerBlock("pale_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    // Plants
    public static final Block PALE_LEAVES = registerBlock("pale_leaves",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block PALE_SAPLING = registerBlock("pale_sapling",
            new SaplingBlock(new PaleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));



    //YELLOWNESS!

    // Wood and Variants
    public static final Block YELLOWNESS_LOG = registerBlock("yellowness_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOWNESS_WOOD = registerBlock("yellowness_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_YELLOWNESS_LOG = registerBlock("stripped_yellowness_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_YELLOWNESS_WOOD = registerBlock("stripped_yellowness_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOWNESS_PLANKS = registerBlock("yellowness_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f).sounds(BlockSoundGroup.WOOD)));

    // construction elements
    public static final Block YELLOWNESS_STAIRS = registerBlock("yellowness_stairs",
            new StairsBlock(YELLOWNESS_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOWNESS_SLAB = registerBlock("yellowness_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOWNESS_FENCE = registerBlock("yellowness_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOWNESS_FENCE_GATE = registerBlock("yellowness_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block YELLOWNESS_DOOR = registerBlock("yellowness_door",
            new DoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Block YELLOWNESS_TRAPDOOR = registerBlock("yellowness_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Identifier YELLOWNESS_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "entity/signs/yellowness");
    public static final Identifier YELLOWNESS_HANGING_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "entity/signs/hanging/yellowness");
    public static final Identifier YELLOWNESS_HANGING_GUI_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "textures/gui/hanging_signs/yellowness");

    public static final Block STANDING_YELLOWNESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "yellowness_standing_sign"),
            new TerraformSignBlock(YELLOWNESS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_YELLOWNESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "yellowness_wall_sign"),
            new TerraformWallSignBlock(YELLOWNESS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_YELLOWNESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "yellowness_hanging_sign"),
            new TerraformHangingSignBlock(YELLOWNESS_HANGING_SIGN_TEXTURE, YELLOWNESS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_YELLOWNESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "yellowness_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(YELLOWNESS_HANGING_SIGN_TEXTURE,YELLOWNESS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily YELLOWNESS_FAMILY = BlockFamilies.register(ModBlocks.YELLOWNESS_PLANKS)
            .sign(ModBlocks.STANDING_YELLOWNESS_SIGN, ModBlocks.WALL_YELLOWNESS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    // Redstone
    public static final Block YELLOWNESS_BUTTON = registerBlock("yellowness_button",
            new ButtonBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision().sounds(BlockSoundGroup.WOOD), BlockSetType.IRON, 5, true));

    public static final Block YELLOWNESS_PRESSURE_PLATE = registerBlock("yellowness_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    // Plants
    public static final Block YELLOWNESS_LEAVES = registerBlock("yellowness_leaves",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block YELLOWNESS_SAPLING = registerBlock("yellowness_sapling",
            new SaplingBlock(new YellownessSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));




    //PURPLENESS


    // Wood and Variants
    public static final Block PURPLENESS_LOG = registerBlock("purpleness_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLENESS_WOOD = registerBlock("purpleness_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_PURPLENESS_LOG = registerBlock("stripped_purpleness_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_PURPLENESS_WOOD = registerBlock("stripped_purpleness_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLENESS_PLANKS = registerBlock("purpleness_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f).sounds(BlockSoundGroup.WOOD)));

    // construction elements
    public static final Block PURPLENESS_STAIRS = registerBlock("purpleness_stairs",
            new StairsBlock(PURPLENESS_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLENESS_SLAB = registerBlock("purpleness_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLENESS_FENCE = registerBlock("purpleness_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLENESS_FENCE_GATE = registerBlock("purpleness_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PURPLENESS_DOOR = registerBlock("purpleness_door",
            new DoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Block PURPLENESS_TRAPDOOR = registerBlock("purpleness_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Identifier PURPLENESS_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "entity/signs/purpleness");
    public static final Identifier PURPLENESS_HANGING_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "entity/signs/hanging/purpleness");
    public static final Identifier PURPLENESS_HANGING_GUI_SIGN_TEXTURE = new Identifier(TheBeginning.MOD_ID, "textures/gui/hanging_signs/purpleness");

    public static final Block STANDING_PURPLENESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "purpleness_standing_sign"),
            new TerraformSignBlock(PURPLENESS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_PURPLENESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "purpleness_wall_sign"),
            new TerraformWallSignBlock(PURPLENESS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_PURPLENESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "purpleness_hanging_sign"),
            new TerraformHangingSignBlock(PURPLENESS_HANGING_SIGN_TEXTURE, PURPLENESS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_PURPLENESS_SIGN = Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, "purpleness_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(PURPLENESS_HANGING_SIGN_TEXTURE,PURPLENESS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily PURPLENESS_FAMILY = BlockFamilies.register(ModBlocks.PURPLENESS_PLANKS)
            .sign(ModBlocks.STANDING_PURPLENESS_SIGN, ModBlocks.WALL_PURPLENESS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    // Redstone
    public static final Block PURPLENESS_BUTTON = registerBlock("purpleness_button",
            new ButtonBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision().sounds(BlockSoundGroup.WOOD), BlockSetType.IRON, 5, true));

    public static final Block PURPLENESS_PRESSURE_PLATE = registerBlock("purpleness_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    // Plants
    public static final Block PURPLENESS_LEAVES = registerBlock("purpleness_leaves",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block PURPLENESS_SAPLING = registerBlock("purpleness_sapling",
            new SaplingBlock(new PurplenessSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));






    //Register Functions
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheBeginning.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TheBeginning.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TheBeginning.LOGGER.info("Registering Modblocks for: " + TheBeginning.MOD_ID);
    }
}