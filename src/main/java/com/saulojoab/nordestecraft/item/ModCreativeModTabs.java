package com.saulojoab.nordestecraft.item;

import com.saulojoab.nordestecraft.NordesteCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NordesteCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NORDESTE_TAB = CREATIVE_MODE_TABS.register("nordeste_craft", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CUSCUZ.get())).title(Component.translatable("creativetab.nordeste_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.CUSCUZ.get());
        pOutput.accept(ModItems.TAPIOCA.get());
    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
