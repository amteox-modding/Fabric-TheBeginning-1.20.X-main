package net.amteox.thebeginning.item;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import com.terraformersmc.terraform.boat.impl.item.TerraformBoatItem;
import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.entity.ModBoats;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item BEGINNING_DUST = registerItem("beginnium_dust", new Item(new FabricItemSettings()));
    public static final Item BEGINNING_INGOT = registerItem("beginnium_ingot", new Item(new FabricItemSettings()));
    public static final Item BEGINNING_SHARD = registerItem("beginnium_shard", new Item(new FabricItemSettings()));


    public static final Item PALE_SIGN = registerItem("pale_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PALE_SIGN, ModBlocks.WALL_PALE_SIGN));

    public static final Item HANGING_PALE_SIGN = registerItem("pale_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_PALE_SIGN, ModBlocks.WALL_HANGING_PALE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item PALE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALE_BOAT_ID, ModBoats.PALE_BOAT_KEY, false);
    public static final Item PALE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALE_CHEST_BOAT_ID, ModBoats.PALE_BOAT_KEY, true);


    //YELLOWNESS

    public static final Item YELLOWNESS_SIGN = registerItem("yellowness_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_YELLOWNESS_SIGN, ModBlocks.WALL_YELLOWNESS_SIGN));

    public static final Item HANGING_YELLOWNESS_SIGN = registerItem("yellowness_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_YELLOWNESS_SIGN, ModBlocks.WALL_HANGING_YELLOWNESS_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item YELLOWNESS_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.YELLOWNESS_BOAT_ID, ModBoats.YELLOWNESS_BOAT_KEY, false);
    public static final Item YELLOWNESS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.YELLOWNESS_CHEST_BOAT_ID, ModBoats.YELLOWNESS_BOAT_KEY, true);


    //PURPLENESS

    public static final Item PURPLENESS_SIGN = registerItem("purpleness_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PURPLENESS_SIGN, ModBlocks.WALL_PURPLENESS_SIGN));

    public static final Item HANGING_PURPLENESS_SIGN = registerItem("purpleness_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_PURPLENESS_SIGN, ModBlocks.WALL_HANGING_PURPLENESS_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item PURPLENESS_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PURPLENESS_BOAT_ID, ModBoats.PURPLENESS_BOAT_KEY, false);
    public static final Item PURPLENESS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PURPLENESS_CHEST_BOAT_ID, ModBoats.PURPLENESS_BOAT_KEY, true);


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(TheBeginning.MOD_ID, name), item);
    }


    public static void registerModItems()
    {
        TheBeginning.LOGGER.info("Registering  Mod Items for: " + TheBeginning.MOD_ID);
    }

}
