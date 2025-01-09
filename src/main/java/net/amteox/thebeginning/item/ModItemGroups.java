package net.amteox.thebeginning.item;

import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheBeginning.MOD_ID, "items"), // Unique ID for the "items" group
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.items"))
                    .icon(() -> new ItemStack(ModItems.BEGINNING_SHARD))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BEGINNING_SHARD);
                        entries.add(ModItems.BEGINNING_DUST);
                        entries.add(ModItems.BEGINNING_INGOT);
                    }).build());

    public static final ItemGroup BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheBeginning.MOD_ID, "blocks"), // Unique ID for the "blocks" group
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks"))
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

                    }).build());



    public static void registerItemGroups(){
        TheBeginning.LOGGER.info("Registering Item groups for: " + TheBeginning.MOD_ID);
    }
}
