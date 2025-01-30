package net.amteox.thebeginning.datagen;

import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.STONE_BRICKS)
                .add(ModBlocks.BEGINNIUM_ORE.asItem())
                .add(ModBlocks.BEGINNIUM_BLOCK.asItem())
                .add(ModBlocks.BEGINNIUM_MAGIC_BLOCK.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALE_LOG.asItem())
                .add(ModBlocks.PALE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALE_WOOD.asItem())
                .add(ModBlocks.YELLOWNESS_LOG.asItem())
                .add(ModBlocks.YELLOWNESS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_YELLOWNESS_LOG.asItem())
                .add(ModBlocks.STRIPPED_YELLOWNESS_WOOD.asItem())
                .add(ModBlocks.PURPLENESS_LOG.asItem())
                .add(ModBlocks.PURPLENESS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PURPLENESS_LOG.asItem())
                .add(ModBlocks.STRIPPED_PURPLENESS_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.WOOL)
                .add(ModItems.BEGINNING_INGOT)
                .add(ModItems.BEGINNING_DUST)
                .add(ModItems.BEGINNING_SHARD)
                .add(ModBlocks.PALE_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PALE_PLANKS.asItem())
                .add(ModBlocks.YELLOWNESS_PLANKS.asItem())
                .add(ModBlocks.PURPLENESS_PLANKS.asItem());
    }
}
