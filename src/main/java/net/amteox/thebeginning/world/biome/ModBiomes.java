package net.amteox.thebeginning.world.biome;

import net.amteox.thebeginning.TheBeginning;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModBiomes {

//    Fog fog = BackgroundRenderer.applyFog(camera, BackgroundRenderer.FogType.FOG_TERRAIN, vector4f, h, bl2, f);
    public static final RegistryKey<Biome> PALE_GARDEN = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheBeginning.MOD_ID, "pale_garden"));

    public static final RegistryKey<Biome> YELLOWNESS_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheBeginning.MOD_ID, "yellowness_biome"));

    public static final RegistryKey<Biome> PURPLENESS_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheBeginning.MOD_ID, "purpleness_biome"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(PALE_GARDEN, PaleGarden(context));
        context.register(YELLOWNESS_BIOME, YellownessBiome(context));
        context.register(PURPLENESS_BIOME, PurplenessBiome(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome PaleGarden(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_DEFAULT);

        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);
        DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.4f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x8e82a8)
                        .waterFogColor(0x8e82a8)
                        .skyColor(0x8e9aaf)
                        .grassColor(0xfffafa)
                        .foliageColor(0xfffafa)
                        .fogColor(0xc0c0c0)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())

                .build();
    }


    public static Biome YellownessBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_DEFAULT);
        DefaultBiomeFeatures.addBamboo(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);
        DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.4f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x7d823a)
                        .waterFogColor(0x7d823a)
                        .skyColor(0x768549)
                        .grassColor(0x71872f)
                        .foliageColor(0x71872f)
                        .fogColor(0x7f9149)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())

                .build();
    }


    public static Biome PurplenessBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_DEFAULT);
//        DefaultBiomeFeatures.addBamboo(biomeBuilder);

        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);
        DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.4f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x6c3885)
                        .waterFogColor(0x6c3885)
                        .skyColor(0x8c51a8)
                        .grassColor(0x613478)
                        .foliageColor(0x613478)
                        .fogColor(0xa070b8)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())

                .build();
    }


}
