package net.amteox.thebeginning.item;

import net.amteox.thebeginning.TheBeginning;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item BEGINNING_DUST = registerItem("beginnium_dust", new Item(new FabricItemSettings()));
    public static final Item BEGINNING_INGOT = registerItem("beginnium_ingot", new Item(new FabricItemSettings()));
    public static final Item BEGINNING_SHARD = registerItem("beginnium_shard", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(TheBeginning.MOD_ID, name), item);
    }


    public static void registerModItems()
    {
        TheBeginning.LOGGER.info("Registering  Mod Items for: " + TheBeginning.MOD_ID);
    }

}
