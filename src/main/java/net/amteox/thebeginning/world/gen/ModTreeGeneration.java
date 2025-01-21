package net.amteox.thebeginning.world.gen;

import net.amteox.thebeginning.world.ModPlacedFeatures;
import net.amteox.thebeginning.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees()
    {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.PALE_GARDEN),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PALE_PLACED_KEY);
    }
}
