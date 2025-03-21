package net.amteox.thebeginning.world.biome.surface;

import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {

    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule STONE = makeStateRule(Blocks.STONE);

    public static MaterialRules.MaterialRule makeRulesForPale() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(
                MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK),
                DIRT
        );

        return MaterialRules.sequence(
                MaterialRules.sequence(
                        MaterialRules.condition(
                                MaterialRules.biome(ModBiomes.PALE_GARDEN),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, GRASS_BLOCK)
                        ),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, DIRT)
                ),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }


    public static MaterialRules.MaterialRule makeRulesForYellowness() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(
                MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK),
                DIRT
        );

        return MaterialRules.sequence(
                MaterialRules.sequence(
                        MaterialRules.condition(
                                MaterialRules.biome(ModBiomes.YELLOWNESS_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, GRASS_BLOCK)
                        ),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, DIRT)
                ),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    public static MaterialRules.MaterialRule makeRulesForPurpleness() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(
                MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK),
                DIRT
        );

        return MaterialRules.sequence(
                MaterialRules.sequence(
                        MaterialRules.condition(
                                MaterialRules.biome(ModBiomes.YELLOWNESS_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, GRASS_BLOCK)
                        ),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, DIRT)
                ),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }



    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
