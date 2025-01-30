package net.amteox.thebeginning.item;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheBeginning.MOD_ID, "items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.items"))
                    .icon(() -> new ItemStack(ModItems.BEGINNING_SHARD))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BEGINNING_SHARD);
                        entries.add(ModItems.BEGINNING_DUST);
                        entries.add(ModItems.BEGINNING_INGOT);
                        entries.add(ModItems.PALE_SIGN);
                        entries.add(ModItems.HANGING_PALE_SIGN);
                        entries.add(ModItems.PALE_BOAT);
                        entries.add(ModItems.PALE_CHEST_BOAT);
                        //YELLOWNESS
                        entries.add(ModItems.YELLOWNESS_SIGN);
                        entries.add(ModItems.HANGING_YELLOWNESS_SIGN);
                        entries.add(ModItems.YELLOWNESS_BOAT);
                        entries.add(ModItems.YELLOWNESS_CHEST_BOAT);

                    })
                    .build());

    public static final ItemGroup BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheBeginning.MOD_ID, "blocks"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.blocks"))
                    .icon(() -> new ItemStack(ModBlocks.BEGINNIUM_BLOCK))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BEGINNIUM_BLOCK);
                        entries.add(ModBlocks.BEGINNIUM_MAGIC_BLOCK);
                        entries.add(ModBlocks.BEGINNIUM_ORE);
                        entries.add(ModBlocks.PALE_LOG);
                        entries.add(ModBlocks.PALE_WOOD);
                        entries.add(ModBlocks.PALE_PLANKS);
                        entries.add(ModBlocks.STRIPPED_PALE_LOG);
                        entries.add(ModBlocks.STRIPPED_PALE_WOOD);
                        entries.add(ModBlocks.PALE_LEAVES);
                        entries.add(ModBlocks.PALE_STAIRS);
                        entries.add(ModBlocks.PALE_SLAB);
                        entries.add(ModBlocks.PALE_BUTTON);
                        entries.add(ModBlocks.PALE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALE_FENCE);
                        entries.add(ModBlocks.PALE_FENCE_GATE);
                        entries.add(ModBlocks.PALE_DOOR);
                        entries.add(ModBlocks.PALE_TRAPDOOR);
                        entries.add(ModBlocks.PALE_SAPLING);

                        //Yellowness
                        entries.add(ModBlocks.YELLOWNESS_LOG);
                        entries.add(ModBlocks.YELLOWNESS_WOOD);
                        entries.add(ModBlocks.YELLOWNESS_PLANKS);
                        entries.add(ModBlocks.STRIPPED_YELLOWNESS_LOG);
                        entries.add(ModBlocks.STRIPPED_YELLOWNESS_WOOD);
                        entries.add(ModBlocks.YELLOWNESS_LEAVES);
                        entries.add(ModBlocks.YELLOWNESS_STAIRS);
                        entries.add(ModBlocks.YELLOWNESS_SLAB);
                        entries.add(ModBlocks.YELLOWNESS_BUTTON);
                        entries.add(ModBlocks.YELLOWNESS_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOWNESS_FENCE);
                        entries.add(ModBlocks.YELLOWNESS_FENCE_GATE);
                        entries.add(ModBlocks.YELLOWNESS_DOOR);
                        entries.add(ModBlocks.YELLOWNESS_TRAPDOOR);
                        entries.add(ModBlocks.YELLOWNESS_SAPLING);

                        //Purpleness

                        entries.add(ModBlocks.PURPLENESS_LOG);
                        entries.add(ModBlocks.PURPLENESS_WOOD);
                        entries.add(ModBlocks.PURPLENESS_PLANKS);
                        entries.add(ModBlocks.STRIPPED_PURPLENESS_LOG);
                        entries.add(ModBlocks.STRIPPED_PURPLENESS_WOOD);
                        entries.add(ModBlocks.PURPLENESS_LEAVES);
                        entries.add(ModBlocks.PURPLENESS_STAIRS);
                        entries.add(ModBlocks.PURPLENESS_SLAB);
                        entries.add(ModBlocks.PURPLENESS_BUTTON);
                        entries.add(ModBlocks.PURPLENESS_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLENESS_FENCE);
                        entries.add(ModBlocks.PURPLENESS_FENCE_GATE);
                        entries.add(ModBlocks.PURPLENESS_DOOR);
                        entries.add(ModBlocks.PURPLENESS_TRAPDOOR);
                        entries.add(ModBlocks.PURPLENESS_SAPLING);
                    })
                    .build());

    public static void registerItemGroups() {
        TheBeginning.LOGGER.info("Registering Item groups for: " + TheBeginning.MOD_ID);
    }
}
