package net.amteox.thebeginning.world.biome;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(TheBeginning.MOD_ID, "overworld"), 4));
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, TheBeginning.MOD_ID, ModMaterialRules.makeRules());
    }
}
