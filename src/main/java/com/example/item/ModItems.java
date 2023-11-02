package com.example.item;

import com.example.examplemod.ExampleMod;
import com.example.item.custom.JumpRingClass;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> SAPPHIRE =
            ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE =
            ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RING_DOUBLE_JUMP =
            ITEMS.register("ring_double_jump", () -> new JumpRingClass(new Item.Properties().durability(100)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
