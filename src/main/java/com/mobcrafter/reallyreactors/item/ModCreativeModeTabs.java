package com.mobcrafter.reallyreactors.item;

import com.mobcrafter.reallyreactors.ReallyReactors;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReallyReactors.MODID);

    public static final RegistryObject<CreativeModeTab> REALLYREACTORS_TAB = CREATIVE_MODE_TABS.register("reallyreactors_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.FUEL_CELL.get()))
                    .title(Component.translatable("creativetab.reallyreactors_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FUEL_CELL_EMPTY.get());
                        pOutput.accept(ModItems.FUEL_CELL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
