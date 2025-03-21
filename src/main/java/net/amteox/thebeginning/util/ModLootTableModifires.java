package net.amteox.thebeginning.util;

import net.amteox.thebeginning.block.ModBlocks;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifires {

    private static final Identifier END_CITY_ID =
            new Identifier("minecraft", "chests/end_city_treasure");

    public static void modifyLootTables()
    {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, lootTableSource) -> {
            if(END_CITY_ID.equals((id)))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModBlocks.BEGINNIUM_MAGIC_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }



        });
    }
}
