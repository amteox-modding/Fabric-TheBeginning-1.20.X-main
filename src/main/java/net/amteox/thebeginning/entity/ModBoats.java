package net.amteox.thebeginning.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.amteox.thebeginning.TheBeginning;
import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {

    public static final Identifier PALE_BOAT_ID = new Identifier(TheBeginning.MOD_ID, "pale_boat");
    public static final Identifier PALE_CHEST_BOAT_ID = new Identifier(TheBeginning.MOD_ID, "pale_chest_boat");

    public static final RegistryKey<TerraformBoatType> PALE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PALE_BOAT_ID);

    public static final Identifier YELLOWNESS_BOAT_ID = new Identifier(TheBeginning.MOD_ID, "yellowness_boat");
    public static final Identifier YELLOWNESS_CHEST_BOAT_ID = new Identifier(TheBeginning.MOD_ID, "yellowness_chest_boat");

    public static final RegistryKey<TerraformBoatType> YELLOWNESS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOWNESS_BOAT_ID);


    public static final Identifier PURPLENESS_BOAT_ID = new Identifier(TheBeginning.MOD_ID, "purpleness_boat");
    public static final Identifier PURPLENESS_CHEST_BOAT_ID = new Identifier(TheBeginning.MOD_ID, "purpleness_chest_boat");

    public static final RegistryKey<TerraformBoatType> PURPLENESS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLENESS_BOAT_ID);



    public static void registerBoats()
    {
        TerraformBoatType paleBoat = new TerraformBoatType.Builder()
                .item(ModItems.PALE_BOAT)
                .chestItem(ModItems.PALE_CHEST_BOAT)
                .planks(ModBlocks.PALE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PALE_BOAT_KEY, paleBoat);

        //YELLOWNESS

        TerraformBoatType yellownessBoat = new TerraformBoatType.Builder()
                .item(ModItems.YELLOWNESS_BOAT)
                .chestItem(ModItems.YELLOWNESS_CHEST_BOAT)
                .planks(ModBlocks.YELLOWNESS_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, YELLOWNESS_BOAT_KEY, yellownessBoat);

        //PURPLENESS


        TerraformBoatType purplenessBoat = new TerraformBoatType.Builder()
                .item(ModItems.PURPLENESS_BOAT)
                .chestItem(ModItems.PURPLENESS_CHEST_BOAT)
                .planks(ModBlocks.PURPLENESS_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PURPLENESS_BOAT_KEY, purplenessBoat);



    }
}
