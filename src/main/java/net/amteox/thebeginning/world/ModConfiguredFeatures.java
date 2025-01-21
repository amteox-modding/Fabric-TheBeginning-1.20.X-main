package net.amteox.thebeginning.world;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    // Defining registry keys for configured features
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEGINNIUM_ORE_KEY = registerKey("beginnium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALE_KEY = registerKey("pale");

    // Function that registers all configured features
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){

        // RuleTest used to specify which blocks can be replaced by ores during generation
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        // List of targets where Beginnium ores will be generated
        List<OreFeatureConfig.Target> overworldBeginniumOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.BEGINNIUM_ORE.getDefaultState()));

        // Registering Beginnium ore with generation configuration
        register(context, BEGINNIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBeginniumOres, 3));

        // Registering the Pale tree feature in the biome
        register(context, PALE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALE_LOG),  // Tree trunk block
                new StraightTrunkPlacer(4, 5, 2),  // Parameters for the tree trunk
                BlockStateProvider.of(ModBlocks.PALE_LEAVES),  // Tree leaf block
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(2), 5),  // Foliage shape
                new TwoLayersFeatureSize(2, 0, 1)).build());  // Tree size configuration
    }

    // Registering a key for ConfiguredFeature
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheBeginning.MOD_ID, name));
    }

    // Function that registers a specific feature with the provided configuration
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
