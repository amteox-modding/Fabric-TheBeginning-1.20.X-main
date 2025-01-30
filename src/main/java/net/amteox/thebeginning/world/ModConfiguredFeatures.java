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
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> BEGINNIUM_ORE_KEY = registerKey("beginnium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALE_KEY = registerKey("pale");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOWNESS_KEY = registerKey("yellowness");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLENESS_KEY = registerKey("purpleness");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        List<OreFeatureConfig.Target> overworldBeginniumOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.BEGINNIUM_ORE.getDefaultState())
        );

        register(context, BEGINNIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBeginniumOres, 6));

        register(context, PALE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALE_WOOD),
                new CherryTrunkPlacer(
                        4,
                        6,
                        4,
                        ConstantIntProvider.create(3),
                        ConstantIntProvider.create(3),
                        UniformIntProvider.create(-4, -2),
                        ConstantIntProvider.create(4)
                ),
                BlockStateProvider.of(ModBlocks.PALE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(2), 3),
                new TwoLayersFeatureSize(2, 0, 1)
        ).build());


        register(context, YELLOWNESS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.YELLOWNESS_WOOD),
                new CherryTrunkPlacer(
                        3,  // Base height (taller trunk)
                        5,  // First random height (more variation)
                        4,  // Second random height (more variation)
                        ConstantIntProvider.create(2),  // Reduced branch count (3 branches)
                        ConstantIntProvider.create(4),  // More controlled branch horizontal length
                        UniformIntProvider.create(-5, -2),  // More reasonable branch start offset
                        ConstantIntProvider.create(2)  // Reasonable branch end offset
                ),


                BlockStateProvider.of(ModBlocks.YELLOWNESS_LEAVES),
                new BlobFoliagePlacer(
                        ConstantIntProvider.create(4),
                        ConstantIntProvider.create(3),
                        4
                ),
                new TwoLayersFeatureSize(4, 3, 2)
        ).build());

        register(context, PURPLENESS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PURPLENESS_WOOD),
                new CherryTrunkPlacer(
                        4,  // Base height (taller trunk)
                        3,  // First random height (more variation)
                        2,  // Second random height (more variation)
                        ConstantIntProvider.create(1),  // Reduced branch count (3 branches)
                        ConstantIntProvider.create(3),  // More controlled branch horizontal length
                        UniformIntProvider.create(-3, -1),  // More reasonable branch start offset
                        ConstantIntProvider.create(4)  // Reasonable branch end offset
                ),


                BlockStateProvider.of(ModBlocks.PURPLENESS_LEAVES),
                new BlobFoliagePlacer(
                        ConstantIntProvider.create(5),
                        ConstantIntProvider.create(4),
                        5
                ),
                new TwoLayersFeatureSize(6, 4, 3)
        ).build());







    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheBeginning.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}