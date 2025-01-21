package net.amteox.thebeginning.world.dimension;

import net.amteox.thebeginning.TheBeginning;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {

    public static final RegistryKey<DimensionOptions> BEGINNINGDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(TheBeginning.MOD_ID, "beginningdim"));
    public static final RegistryKey<World> BEGINNINGDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(TheBeginning.MOD_ID, "beginningdim"));
    public static final RegistryKey<DimensionType> BEGINNINGDIM_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(TheBeginning.MOD_ID, "beginningdim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(BEGINNINGDIM_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                true, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                false, // bedWorks
                true, // respawnAnchorWorks
                0, // minY
                128, // height (updated max Y value from 128 to 256)
                128, // logicalHeight (height where logic like world generation occurs)
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
