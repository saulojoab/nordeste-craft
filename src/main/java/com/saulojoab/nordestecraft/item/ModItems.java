package com.saulojoab.nordestecraft.item;

import com.saulojoab.nordestecraft.NordesteCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NordesteCraft.MOD_ID);

    public static final RegistryObject<Item> CUSCUZ = ITEMS.register("cuscuz", () -> new Item(new Item.Properties().food(ModFoods.Cuscuz)));
    public static final RegistryObject<Item> TAPIOCA = ITEMS.register("tapioca", () -> new Item(new Item.Properties().food(ModFoods.Tapioca)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
