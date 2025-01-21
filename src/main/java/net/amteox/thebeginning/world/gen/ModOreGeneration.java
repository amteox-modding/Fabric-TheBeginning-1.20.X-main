package net.amteox.thebeginning.world.gen;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.world.ModPlacedFeatures;
import net.amteox.thebeginning.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.dimension.DimensionType;

public class ModOreGeneration {
    public static void generateOres() {
        // Replace with the correct Identifier for your custom dimension
        Identifier customDimensionId = new Identifier(TheBeginning.MOD_ID, "beginningdim");

        // Apply the ore generation to biomes in your custom dimension
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(ModBiomes.PALE_GARDEN), // Replace PLAINS with a biome in your custom dimension
                GenerationStep.Feature.UNDERGROUND_ORES, // The step where ore generation occurs
                ModPlacedFeatures.BEGINNIUM_ORE_PLACED_KEY // The feature key for ore generation
        );
    }
}
