package net.amteox.thebeginning.item;

import net.amteox.thebeginning.TheBeginning;
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
                    .icon(() -> new ItemStack(Items.GLOW_ITEM_FRAME))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.DIAMOND);
                    }).build());

    public static final ItemGroup BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheBeginning.MOD_ID, "blocks"), // Unique ID for the "blocks" group
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks"))
                    .icon(() -> new ItemStack(Blocks.LIGHT_GRAY_BANNER))
                    .entries((displayContext, entries) -> {
                        entries.add(Blocks.DARK_OAK_BUTTON);
                    }).build());


    public static void registerItemGroups(){
        TheBeginning.LOGGER.info("Registering Item groups for: " + TheBeginning.MOD_ID);
    }
}
