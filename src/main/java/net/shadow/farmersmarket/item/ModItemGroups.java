package net.shadow.farmersmarket.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shadow.farmersmarket.FarmersMarket;
import net.shadow.farmersmarket.block.ModBlocks;


public class ModItemGroups {

    public static final ItemGroup FARMERS_MARKET = Registry.register(Registries.ITEM_GROUP, new Identifier(FarmersMarket.MOD_ID, "farmers_market"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.farmers_market"))
                    .icon(() -> new ItemStack(ModItems.RAPIER)).entries((displayContext, entries) -> {


                        //entries.add(ModItems.SLIVER_FLESH);
                        entries.add(ModItems.RAPIER_UPGRADE);
                        entries.add(ModItems.RAPIER);
                        entries.add(ModItems.BLOODHOUNDAXE);
                        entries.add(ModItems.GREATSWORD);
                        //entries.add(ModItems.ARBALESTDESCENDANT);
                        entries.add(ModItems.HEXSPADE);

                        entries.add(ModItems.CRACKED_TOTEM);

                        //entries.add(ModBlocks.POTION_WEB);
                        //.add(ModBlocks.THREAD_WEAVER);


                    }).build());

    public static final ItemGroup FARMERS_COSMETICS = Registry.register(Registries.ITEM_GROUP, new Identifier(FarmersMarket.MOD_ID, "farmers_cosmetics"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.farmers_cosmetics"))
                    .icon(() -> new ItemStack(ModItems.VEINPIERCER)).entries((displayContext, entries) -> {



                        entries.add(ModItems.CORRUPTEDFLESH);

                        entries.add(ModItems.VEINPIERCER);
                        entries.add(ModItems.ALTSWORD);
                        entries.add(ModItems.MAINSWORD);



                    }).build());
    public static void registerItemGroups() {
        FarmersMarket.LOGGER.info("registering Item Groups for " + FarmersMarket.MOD_ID);
    }
}
