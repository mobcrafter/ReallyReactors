package com.mobcrafter.reallyreactors.item;

import com.mobcrafter.reallyreactors.ReallyReactors;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ReallyReactors.MODID);

    public static final RegistryObject<Item> FUEL_CELL_EMPTY = ITEMS.register("fuel_cell_empty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUEL_CELL = ITEMS.register("fuel_cell",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
